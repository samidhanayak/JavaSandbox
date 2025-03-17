package Mar08;

public class ToStringDemo {
    int empnbr;
    String empname;
    Double sal;

    public ToStringDemo(int empnbr, String empname, Double sal) {
        this.empnbr = empnbr;
        this.empname = empname;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "ToStringDemo{" +
                "empnbr=" + empnbr +
                ", empname='" + empname + '\'' +
                ", sal=" + sal +
                '}';
    }

    public static void main(String[] args) {
        ToStringDemo tsd = new ToStringDemo(101,"Pragra",80000.00);
        System.out.println(tsd);
    }
}
