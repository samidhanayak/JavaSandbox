package Feb18;

import java.util.Scanner;

public class SumFirstDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int x = 0;
        int i = 0;
        int sum = 0;
        System.out.println("**Sum of first n even numbers**");
        System.out.println("Please enter the value of n:");
        num = scanner.nextInt();

         do {
            sum = sum + x;
            System.out.print(x+"+");
            x = x+2;
            i++;
        } while (i < num);

        System.out.println("="+sum);
    }
}
