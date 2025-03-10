package Feb15;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        System.out.println("Please enter 1 for Billing");
        System.out.println("Please enter 2 for Technical Support");
        System.out.println("Please enter 3 for Sales");
        System.out.println("Please enter 4 to speak to an agent");
        System.out.println("Please enter 5 return to the main menu");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("You have entered 1 for Billing");
                System.out.println("Please enter 1 for Payment Arrangement");
                System.out.println("Please enter 2 for Over Charge");
                int innerinput = scanner.nextInt();
                if (innerinput == 1)
                System.out.println("You entered "+innerinput+" for Payment Arrangement");
                else if (innerinput == 2) {
                    System.out.println("You entered "+innerinput+" for OverCharge");
                }
                break;
            case 2:
                System.out.println("You have entered 2 for Technical Support");
                System.out.println("Please enter 1 for Internet");
                System.out.println("Please enter 2 for Mobile");
                int innerinput2 = scanner.nextInt();
                if (innerinput2 == 1)
                    System.out.println("You entered "+innerinput2+" for Internet");
                else if (innerinput2 == 2) {
                    System.out.println("You entered "+innerinput2+" for Mobile");
                }
                break;
            case 5:
                break;
        }


    }
}
