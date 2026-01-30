public class Computer {
    private String marca;
    private String processore;
    private int ram;

    public Computer(String marca, String processore, int ram) {
        this.marca = marca;
        this.processore = processore;
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

public String toString() {
        return "MARCA:" + marca + ", PROCESSORE: " + processore + ", RAM: " + ram + "GB";
    }
}
