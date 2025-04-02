package apr01;

import java.util.*;

class CustomLinkedList {
    private List<Employee> employees;

    public CustomLinkedList() {
        this.employees = new ArrayList<>();
    }

    public void add(Employee emp) {
        employees.add(emp);
    }

    public Employee findHighestSalaryEmployee() {
        if (employees.isEmpty()) return null; // If the list is empty

        Employee highestPaid = employees.get(0); // Assume first employee has highest salary

        for (Employee emp : employees) {
            if (emp.esal > highestPaid.esal) {
                highestPaid = emp;
            }
        }
        return highestPaid;
    }


    public static void main(String[] args) {
        CustomLinkedList employeeList = new CustomLinkedList();
        employeeList.add(new Employee(1, "Alice", 155000));
        employeeList.add(new Employee(2, "Bob", 172000));
        employeeList.add(new Employee(3, "Charlie", 168000));

        Employee highestPaid = employeeList.findHighestSalaryEmployee();
        System.out.println("Employee with highest salary: " + highestPaid);
    }
}
