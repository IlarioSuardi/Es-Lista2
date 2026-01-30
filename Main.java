public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserimentoOrdinato(new Computer("Dell", "i5", 8));
        lista.inserimentoOrdinato(new Computer("HP", "i7", 16));
        lista.inserimentoOrdinato(new Computer("Lenovo", "Ryzen 5", 12));
        lista.inserimentoOrdinato(new Computer("Apple", "M1", 16));

        System.out.println("Lista ordinata per RAM (crescente):");
        lista.stampa();
    }
}
