package apr08.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Bank> {


    @Override
    public int compare(Bank o1, Bank o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
