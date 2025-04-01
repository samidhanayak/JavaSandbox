package mar29;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;


public class NewFileIODemo {
    public static void main(String[] args) {

        writeToFile();
        readFromFile();

    }

    public static void writeToFile(){
        Path path = Paths.get("Demo2.txt");

        try {
            Files.write(path, "Hello this is new type of file handling".getBytes(),StandardOpenOption.APPEND);
            //System.out.println("File has been written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFromFile(){
        Path path = Paths.get("Demo2.txt");

        try {
            List<String> list = Files.readAllLines(path);
            System.out.println(list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
