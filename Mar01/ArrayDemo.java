package Mar01;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String[] str = new String[5];
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the elements of the array: 5 integers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing arr elements");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Please enter the elements of the array: 5 strings");

        for (int i = 0; i < arr.length; i++) {
            str[i] = scanner.next();
        }

        System.out.println("Printing str elements");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        
    }
}
