package apr29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("bob","tom","tom","jon","sam","jon","sam","john","sammy","peter","peterson","donald"));
        List<String> procList = stringList.stream().filter(s -> s.length() == 3).distinct().collect(Collectors.toList());
        System.out.println(procList);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(23423,3425323,53423,2354,2343,24675,865,573));
        List<String> numbersString =
                numbers.stream()
                .filter(n -> n%2 != 0)
                .map(n -> {
                    n = n*2;
                    return n;
                })

                .map(s -> (String) s.toString())
                .filter(t -> ((String) t).startsWith("4"))
                .map(u -> ((String) u).substring(3))
                .collect(Collectors.toList());

        System.out.println(numbersString);


    }
}
