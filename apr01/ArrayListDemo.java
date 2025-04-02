package apr01;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(null);

        System.out.println(list);

        list.remove(1);
        list.set(1,22);
        System.out.println(list);

        Object[] objects = list.toArray();

        System.out.println(objects.length);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(33);
        list2.addAll(list);
        System.out.println(list2);
        System.out.println(list2.lastIndexOf(22));


    }
}
