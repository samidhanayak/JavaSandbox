package apr05;

import java.util.*;

public class ListIteratorDemo {

    public static void main(String[] args) {

        System.out.println("List Iterator");
        List<Integer> l2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 40, 50, 55, 30, 33, 44, 44));

        ListIterator<Integer> l3 = l2.listIterator();


        while (l3.hasNext()){
            Integer next = l3.next();
            System.out.println(next);

            if(next == 20) {
                l3.remove();
            }
        }

        HashSet<Integer> s2 = new HashSet<>();
        s2.addAll(l2);
        System.out.println("s2: "+s2);

        Iterator<Integer> itr = s2.iterator();

        while (itr.hasNext()) {
            Integer val = itr.next();
            System.out.println(val);
            if (val == 50) {
                itr.remove(); // ✅ Safe removal
            }
        }

        System.out.println("Updated HashSet: " + s2);

    }


}
