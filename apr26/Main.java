package apr26;

public class Main {
    public static void main(String[] args) {
        IUtil ioe = x -> {
            if (x % 2 == 0) return true;
            else return false;
        };

        System.out.println(ioe.checkEven(45));
    }
}
