package apr05;
import java.util.*;

public class SetExercise {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,40,50,55,30,33,44,44};


        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s1.add(arr[i]);
        }

        System.out.println("s1:   "+s1);

        List<Integer> l = Arrays.asList(10,20,30,40,40,50,55,30,33,44,44);
        HashSet<Integer> s2 = new HashSet<>();
        s2.addAll(l);
        System.out.println("s2: "+s2);






    }
}
