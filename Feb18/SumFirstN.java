package Feb18;

import java.util.Scanner;

public class SumFirstN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int x = 0;
        int sum = 0;
        System.out.println("**Sum of first n numbers**");
        System.out.println("Please enter the value of n:");
        num = scanner.nextInt();

        while (x <= num) {
            sum = sum + x;
            //System.out.print("sum = "+sum+" ");
            x++;
        }

        System.out.println("The sum of first "+num+" numbers is: "+sum);

    }
}
