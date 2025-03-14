package Mar01;

import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the elements of the array: 10 integers");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {

            if (arr1[i] > max ) {
                max = arr1[i];
            }
            System.out.println("max inside="+max);

        }

        System.out.println("max final="+max);

        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {

            if (arr1[i] < min ) {
                min = arr1[i];
            }
            System.out.println("min inside="+min);

        }

        System.out.println("min final="+min);

    }

}
