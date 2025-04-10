package apr05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class DuplicatesExercise {
    public static void main(String[] args) {

        List<String> list = readFromFile();

        System.out.println(list);

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String current = itr.next();
            if (!seen.add(current)) {
                // Duplicate found
                duplicates.add(current);
                itr.remove(); // remove duplicate
            }
        }

        // Print duplicates
        System.out.println("Duplicates: " + duplicates);
        // Print updated list without duplicates
        System.out.println("List after removing duplicates: " + list);
    }


    public static List<String> readFromFile() {
        Path path = Paths.get("Demo2.txt");

        try {
            List<String> list = Files.readAllLines(path);
            return list;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

