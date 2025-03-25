package Mar08.InheritanceDemo;

public class TestInheritance {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.color = "Blue";
        c1.memory = 1000;
        c1.processor = "intel";
        c1.showComputerSpecs();

        Laptop l1 = new Laptop();
        l1.price = 50;
        l1.color = "silver";
        l1.memory = 2000;
        l1.processor = "AMD";
        l1.showLaptopSpecs();
        l1.showComputerSpecs();

        Tablet t1 = new Tablet();
        t1.weight = 25;
        t1.price = 300;
        t1.color = "Red";
        t1.memory = 4321;
        t1.processor = "Nvidia";
        t1.showTabSpecs();
        l1.showLaptopSpecs();
        l1.showComputerSpecs();
    }
}
