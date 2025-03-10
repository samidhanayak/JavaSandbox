package Feb18;

import java.util.Scanner;

public class ForContinueBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int x;
        int sum = 0;

        do {
            System.out.println("**Sum of first n even numbers**");
            System.out.println("Please enter the value of n:");

            num = scanner.nextInt();

            for (int j = 0; j < num*2; j++) {
                if (j%2 != 0) continue;

                System.out.print(j+"+");
                sum = sum + j;

            }

            System.out.println("="+sum);

            System.out.println("Please press 0 to re-do or 1 to exit");
            x = scanner.nextInt();
            if (x == 1) {
                break;
            }
        } while (x == 0);

    }
}
