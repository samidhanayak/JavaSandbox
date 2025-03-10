package Feb22;

public class TestMethodOverload {
    public static void main(String[] args) {
        ArithmeticDemo a = new ArithmeticDemo();
        System.out.println("answer: "+ a.sum(1,2));
        System.out.println("answer: "+ a.sum(1,2,3));
        System.out.println("answer: "+ a.sum(1,2,3,4));
    }
}
