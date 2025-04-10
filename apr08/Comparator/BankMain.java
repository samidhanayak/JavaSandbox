package apr08.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        List<Bank> list = new ArrayList<>();

        list.add(new Bank(321,"Z",23423.34));
        list.add(new Bank(345,"Y",5234324.21));
        list.add(new Bank(261,"X",776756.23));
        list.add(new Bank(123,"W",345342.45));

        System.out.println("List before sorting:  "+list);

        Collections.sort(list,new NameComparator());

        System.out.println("List after sorting:  "+list);
    }
}
