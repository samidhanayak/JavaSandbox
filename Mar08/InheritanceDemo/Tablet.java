package Mar08.InheritanceDemo;

public class Tablet extends Laptop{
    int weight;

    public Tablet(int weight) {
        this.weight = weight;
    }

    public Tablet() {
    }
    public void showTabSpecs() {
        System.out.println("Tablet sepcs");
        System.out.println("weight: "+weight);
        System.out.println("price: "+price);
        System.out.println("color: "+color);
        System.out.println("memory: "+memory);
        System.out.println("processor: "+processor);
    }

}
