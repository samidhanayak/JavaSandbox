package Mar04;

import java.util.Scanner;

public class MultiArrayForEach {

    public static void main(String[] args) {

        int arr[][] = {{3,2,1},{6,5,4}};

       for (int [] arr1 : arr){
           for (int num : arr1) {
               System.out.println(num);

           }
       }
    }
}
