package apr05;

import java.util.HashSet;
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        System.out.println("Set");
        Set<Integer> setDemo = new HashSet<>();
        setDemo.add(20);
        setDemo.add(30);
        setDemo.add(40);
        setDemo.add(50);
        setDemo.add(50);

        System.out.println(setDemo);
        System.out.println(setDemo.remove(50));

        System.out.println(setDemo);

        System.out.println("LinkedHashSet");
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(55);
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);


        System.out.println(ls);
        ls.remove(55);
        System.out.println(ls);
        System.out.println(ls.contains(44));
        System.out.println(ls.containsAll(setDemo));

        System.out.println("Treeset");

        Set<Integer> ts = new TreeSet<>();
        ts.add(55);
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);


        System.out.println(ts);
        ts.remove(55);
        System.out.println(ts);
        System.out.println(ts.contains(44));
        System.out.println(ts.containsAll(setDemo));

    }
}
