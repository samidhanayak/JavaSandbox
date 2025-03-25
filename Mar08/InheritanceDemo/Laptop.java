package Mar08.InheritanceDemo;

public class Laptop extends Computer{
    int price;

    public Laptop(int price) {
        this.price = price;
    }

    public Laptop() {
    }
    public void showLaptopSpecs() {
        System.out.println("Laptop sepcs");
        System.out.println("price: "+price);
        System.out.println("color: "+color);
        System.out.println("memory: "+memory);
        System.out.println("processor: "+processor);
    }
}
