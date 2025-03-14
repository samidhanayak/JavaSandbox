package Mar01;

import java.util.Scanner;

public class ArrayReverse {


    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the elements of the array: 10 integers");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }


        int temp;
        int j = arr1.length-1;

        for (int i = 0; i < arr1.length/2; i++) {
                temp = arr1[i];
                arr1[i] = arr1 [j];
                arr1 [j] = temp;
                j--;
            }


        System.out.println("Printing reverse array");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }

}
