package Feb22;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        float x;
        float y;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Welcome to my Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            System.out.println("Please enter your selection");
            int input = scanner.nextInt();

            System.out.println("your input is "+input);

            System.out.println("Please enter the first number:");
            x = scanner.nextInt();

            System.out.println("Please enter the second number:");
            y = scanner.nextInt();

            ArithmeticDemo a = new ArithmeticDemo();

            switch (input) {

                case 1:
                    //addition
                    System.out.println("addition result = "+a.sum(x,y));
                    break;

                case 2:
                    //subtraction
                    System.out.println("subtraction result = "+a.sub(x,y));
                    break;

                case 3:
                    //multiplication
                    System.out.println("multiplication result = "+a.mul(x,y));
                    break;

                case 4:
                    //division
                    System.out.println("division result = "+a.divi(x,y));
                    break;

                case 5:
                    //modulus
                    System.out.println("modulus result = "+a.mod(x,y));
                    break;
            }

            System.out.println("Please press 0 to re-do or 1 to exit");
            x = scanner.nextInt();
            if (x == 1) {
                break;
            }
        } while (x == 0);

    }
}
