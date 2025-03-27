package Mar15.HasADemo;

public class EmployeeMain {
    public static void main(String[] args) {

        Address a1 = new Address("123 ABC St", "Toronto", "ON", "Canada", "123 456");
        Address a2 = new Address("456 DEF St", "Mississauga", "ON", "Canada", "678 901");
        Address a3 = new Address("234 GHI St", "Brampton", "ON", "Canada"," 432 456");

        Address a5 = new Address("876 PQR St", "Niagara","ON","Canada","876 456");


        Employee e1 = new Employee(101, new FullName("Tom","","S"), "tom@gmail.com", a1, 200000);
        Employee e2 = new Employee(102, new FullName("Dick","","S"), "dick@gmail.com", a2, 200000);
        Employee e3 = new Employee(103, new FullName("Harry","","S"), "harry@gmail.com", a3, 200000);
        Employee e4 = new Employee(104, new FullName("Joe","","S"), "joe@gmail.com", new Address("654 LMN St", "Caledon", "ON", "Canada", "543 456"), 200000);
        Employee e5 = new Employee(105, new FullName("Bob","","S"), "bob@gmail.com", a5, 200000);


        System.out.println(e2.toString());

        System.out.println(e2.getAddress().toString());

        System.out.println(e4.toString());

        System.out.println(e3.getName());
    }

}
