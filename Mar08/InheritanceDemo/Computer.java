package Mar08.InheritanceDemo;

public class Computer {
    String color;
    int memory;
    String processor;

    public Computer(String color, int memory, String processor) {
        this.color = color;
        this.memory = memory;
        this.processor = processor;
    }

    public Computer() {
    }
    public void showComputerSpecs() {
        System.out.println("Computer sepcs");
        System.out.println("color: "+color);
        System.out.println("memory: "+memory);
        System.out.println("processor: "+processor);
    }
}
