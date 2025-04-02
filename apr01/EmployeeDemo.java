package apr01;

import java.util.*;


public class EmployeeDemo {

    public static void main(String[] args) {

        LinkedList<Employee> elist = new LinkedList<>();

        elist.add(new Employee(101,"Tom",100000.00));
        elist.add(new Employee(102,"Dick",200000.00));
        elist.add(new Employee(103,"Harry", 250000.00));
        elist.add(new Employee(104,"Tim",300000.00));

        System.out.println(elist);


    }
}
