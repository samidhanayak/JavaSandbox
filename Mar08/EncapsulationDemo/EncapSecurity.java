package Mar08.EncapsulationDemo;

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
}
