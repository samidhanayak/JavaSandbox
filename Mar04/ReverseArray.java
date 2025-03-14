package Mar04;

public class ReverseArray {
    public static void main(String[] args) {
        String arr = "Pragra";

        char[] arr1 = arr.toCharArray();

        char temp;
        int j = arr1.length-1;
        System.out.println("j:"+j);

        for (int i = 0; i < arr1.length/2; i++) {
            temp = arr1[i];
            arr1[i] = arr1 [j];
            arr1 [j] = temp;
            j--;
            System.out.println("arr1[i]:"+arr1[i]);
            System.out.println("arr1[j]:"+arr1[j]);
        }


        System.out.println("Printing reverse char array");
        System.out.println(arr1);
    }
}
