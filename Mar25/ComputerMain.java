package Mar25;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.test();

        Computer.Motherboard motherboard = new Computer.Motherboard();

        motherboard.makeCalculations();

    }
}
