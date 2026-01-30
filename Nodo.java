public class Nodo {
    private Computer value;
    private Nodo next;

    public Nodo(Computer value, Nodo next) {
        this.value = value;
        this.next = null;
    }

    public Computer getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setValue(Computer value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
