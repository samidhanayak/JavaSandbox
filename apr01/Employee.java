package apr01;

import java.util.ArrayList;

public class Employee {
    int empid;
    String ename;
    double esal;

    public Employee(int empid, String ename, double esal) {
        this.empid = empid;
        this.ename = ename;
        this.esal = esal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", esal=" + esal +
                '}';
    }

}

