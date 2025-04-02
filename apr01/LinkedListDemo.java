package apr01;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(11);
        llist.add(22);
        llist.add(33);
        llist.add(44);

        System.out.println(llist);
        System.out.println(llist.size());
        System.out.println(llist.offer(33));
    }
}
