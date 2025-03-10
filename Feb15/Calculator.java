package Feb15;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to my Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your selection");
        int input = scanner.nextInt();

        System.out.println("your input is "+input);

        System.out.println("Please enter first number");
        float x = scanner.nextFloat();
        System.out.println(x);

        System.out.println("Please enter enter second number");
        float y = scanner.nextFloat();
        System.out.println(y);

        float result;

        switch (input) {

            case 1:
                //addition
                result = x + y;
                System.out.println("addition result = "+result);
                break;

            case 2:
                //subtraction
                result = x - y;
                System.out.println("subtraction result = "+result);
                break;

            case 3:
                //multiplication
                result = x * y;
                System.out.println("multiplication result = "+result);

                break;

            case 4:
                //division
                result = x / y;
                System.out.println("division result = "+result);

                break;

            case 5:
                //modulus
                result = x % y;
                System.out.println("modulus result = "+result);

                break;
        }

    }
}
