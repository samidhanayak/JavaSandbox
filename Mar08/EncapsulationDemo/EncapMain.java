package Mar08.EncapsulationDemo;

public class EncapMain {
    public static void main(String[] args) {
        EncapSecurity es = new EncapSecurity("user1","pass1");
        //es.setUsername("user2");
        es.setPassword("pass2");
        System.out.println("username: "+es.getUsername());
        System.out.println("password: "+es.getPassword());
    }
}
