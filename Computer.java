public class Computer implements Comparable<Computer> {
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

    public int compareTo(Computer other) {
        if(this.ram < other.ram) {
            return -1;
        } else if(this.ram > other.ram) {
            return 1;
        } else {
            return 0;
        }
    }

public String toString() {
        return "MARCA:" + marca + ", PROCESSORE: " + processore + ", RAM: " + ram + "GB";
    }
}
