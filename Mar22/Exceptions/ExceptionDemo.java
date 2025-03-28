package Mar22.Exceptions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the first number");
            int x = scanner.nextInt();

            System.out.println("Please enter the second number");
            int y = scanner.nextInt();

            int result = x/y;

            System.out.println("Will I get printed?");

            String sample = null;
            sample.toLowerCase();
            System.out.println(sample);



        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("I will definitely get printed");
        }
    }
}
