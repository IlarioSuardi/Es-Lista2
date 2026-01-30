public class Lista {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }

    public void accoda(Computer value) {
        Nodo nuovoNodo = new Nodo(value, null);
        if (head == null) {
            head = nuovoNodo;
        } else {
            Nodo t = head;
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(nuovoNodo);
        }
        size++;
    }

    public Computer visita() {
        if (cursor == null) {
            return null;
        }
        Computer valore = cursor.getValue();
        cursor = cursor.getNext();
        return valore;
    }

    public Computer leggi(int indice) {
        if (indice < 0 || indice >= size) {
            return null;
        }
        Nodo t = head;
        for (int i = 0; i < indice; i++) {
            t = t.getNext();
        }
        return t.getValue();
    }

    public void inserisci(Computer value, int indice) {
        if (indice < 0 || indice > size) {
            return;
        }
        Nodo nuovoNodo = new Nodo(value, null);
        if (indice == 0) {
            nuovoNodo.setNext(head);
            head = nuovoNodo;
        } else {
            Nodo t = head;
            for (int i = 0; i < indice - 1; i++) {
                t = t.getNext();
            }
            nuovoNodo.setNext(t.getNext());
            t.setNext(nuovoNodo);
        }
        size++;
    }

    public void elimina(int indice) {
        if (indice < 0 || indice >= size) {
            return;
        }
        if (indice == 0) {
            head = head.getNext();
        } else {
            Nodo t = head;
            for (int i = 0; i < indice - 1; i++) {
                t = t.getNext();
            }
            t.setNext(t.getNext().getNext());
        }
        size--;
    }

    public void eliminazioneCompleta(Computer value) {
        while (head != null && head.getValue().equals(value)) {
            head = head.getNext();
            size--;
        }
        if (head == null) return;
        Nodo t = head;
        while (t.getNext() != null) {
            if (t.getNext().getValue().equals(value)) {
                t.setNext(t.getNext().getNext());
                size--;
            } else {
                t = t.getNext();
            }
        }
    }

    public int ricerca(Computer valore) {
        Nodo t = head;
        int indice = 0;
        while (t != null) {
            if (t.getValue().equals(valore)) {
                return indice;
            }
            t = t.getNext();
            indice++;
        }
        return -1;
    }

    public void inserimentoOrdinato(Computer c) {
        Nodo nuovo = new Nodo(c, null);

        if (head == null || c.compareTo(head.getValue()) < 0) {
            nuovo.setNext(head);
            head = nuovo;
            return;
        }

        Nodo corrente = head;
        while (corrente.getNext() != null &&
                corrente.getNext().getValue().compareTo(c) <= 0) {
            corrente = corrente.getNext();
        }

        nuovo.setNext(corrente.getNext());
        corrente.setNext(nuovo);
    }


    public void stampa() {
        Nodo corrente = head;
        while (corrente != null) {
            System.out.println(corrente.getValue());
            corrente = corrente.getNext();
        }
    }
}