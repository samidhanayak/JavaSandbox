package may03;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class BuildNOptionals {
    public static void main(String[] args) {

        Student student1 = Student.builder().firstName("Sam").lastName("N").sId(101).grade(90).build();
        Student student2 = Student.builder().firstName("Sum").lastName("UP").sId(102).grade(92).build();
        Student student3 = Student.builder().firstName("Nis").lastName("S").sId(103).grade(94).build();
        Student student4 = Student.builder().firstName("Niv").lastName("S").sId(104).grade(96).build();

        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3, student4));

        students.stream()
                .filter(g -> g.getGrade()>90)
                .filter(s -> s.getLastName().startsWith("S"))
                .map(s -> {
                    s.setGrade(s.getGrade() + 10);
                    return s;
                }).forEach(s -> System.out.println(s));

        students.stream()
                .filter(s -> s.getLastName().startsWith("S"))
                .map(s -> s.getFirstName())
                .forEach(name -> System.out.println(name));

        System.out.println(Stream.generate(() -> (int) (Math.random() * 1000))
                .limit(3)
                .filter(n -> n % 4 == 0)
                .findFirst().orElseGet(() -> 30));

        Stream.generate(() -> (int) (Math.random() * 1000))
                .limit(10)
                .filter(n -> n % 4 == 0)
                .sorted()
                .forEach(n -> System.out.println(n));


    }
}
