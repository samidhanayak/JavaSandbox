package apr08.Comparator;

public class Bank {
    int acct_id;
    String name;
    Double balance;

    public Bank(int acct_id, String name, Double balance) {
        this.acct_id = acct_id;
        this.name = name;
        this.balance = balance;
    }

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "acct_id=" + acct_id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
