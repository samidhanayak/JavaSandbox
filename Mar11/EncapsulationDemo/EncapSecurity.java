package Mar11.EncapsulationDemo;

public class EncapSecurity {
    private String username;
    private String password;

    public EncapSecurity() {
    }

    public EncapSecurity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void isValidUSer(String username,String password){
        if ((this.username.equalsIgnoreCase(username)) && (this.password.equalsIgnoreCase(password))) {
            System.out.println("User is valid");
        }
        else {
            System.out.println("User not valid");
        }
    }
}
