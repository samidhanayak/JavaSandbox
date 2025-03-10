package Feb18;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int x = 0;
        System.out.println("**Printing numbers from 1 to n (n should be less than 100.**");
        System.out.println("Please enter the value of n:");
        num = scanner.nextInt();
        if (num<=100){
            while (x <= num){
                System.out.println(x);
                x++;
            }
        } else {
            System.out.println("Please enter a number less than 100");
        }


    }
}
