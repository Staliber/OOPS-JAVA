class CPU {
    int price;
    CPU(int price) {
        this.price = price;
    }
    class Processor {
        int cores;
        String manufacturer;
        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        void display() {
            System.out.println("Number of cores: " + cores);
            System.out.println("Processor manufacturer: " + manufacturer);
        }
    }
    static class RAM {
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        void display() {
            System.out.println("Memory: " + memory + " GB");
            System.out.println("RAM manufacturer: " + manufacturer);
        }
    }
    void display() {
        System.out.println("Price of CPU: " + price);
    }
    public static void main(String[] args) {
        CPU cpu = new CPU(122000);
        CPU.Processor pro = cpu.new Processor(20, "Intel");
        CPU.RAM ram = new CPU.RAM(32, "Adata");
        cpu.display();
        pro.display();
        ram.display();
    }
}
