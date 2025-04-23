package apr22;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

    public static void main(String[] args) {

        Map<Student,Integer> student = new HashMap<>();

        student.put(new Student(1,"Tom","A"),110000);
        student.put(new Student(2,"Dick","B"),120000);
        student.put(new Student(3,"Harry","C"),130000);

        System.out.println(student.get(new Student(3,"Harry","C")));

    }

}
