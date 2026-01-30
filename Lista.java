public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public void inserimentoOrdinato(Computer c) {
        Nodo nuovo = new Nodo(c);

        if (head == null || c.getRam() < head.getValue().getRam()) {
            nuovo.setNext(head);
            head = nuovo;
            return;
        }

        Nodo corrente = head;

        while (corrente.getNext() != null &&
                corrente.getNext().getValue().getRam() <= c.getRam()) {
            corrente = corrente.getNext();
        }

        nuovo.setNext(corrente.getNext());
        corrente.setNext(nuovo);
    }

    public String toString() {
        Nodo t = head;
        String s = "";
        while (t != null) {
            s += t + "\n";
            t = t.getNext();
        }
        return s;
    }
}
