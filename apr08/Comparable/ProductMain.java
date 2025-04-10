package apr08.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1231,"M","Product 1"));
        list.add(new Product(243,"G","Product 2"));
        list.add(new Product(453,"N","Product 3"));
        list.add(new Product(6776,"P","Product 4"));
        list.add(new Product(75,"D","Product 5"));

        System.out.println("Product List before sorting:  "+list);
        Collections.sort(list);
        System.out.println("Product List after sorting:  "+list);

    }
}
