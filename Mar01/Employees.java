package Mar01;

public class Employees {
    static String company = "ABC";
    static int noOfTags = 5;
    int id;
    String name;
    String email;


    public Employees(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        noOfTags --;
    }
    public void printEmployees() {
        System.out.println(this.company);
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(noOfTags);
    }
    public static void main(String[] args) {
        Employees employees = new Employees(54321,"Tom","Tom@ABC.com");
        employees.printEmployees();
        Employees employees2 = new Employees(54322,"Dick","Dick@ABC.com");
        employees2.printEmployees();
        Employees employees3 = new Employees(54323,"Harry","Harry@ABC.com");
        employees3.printEmployees();
    }
}



