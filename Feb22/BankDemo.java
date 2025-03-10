package Feb22;

public class BankDemo {
    long accountNumber;
    double accountBalance;

    public BankDemo(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void currentBalance(long accountNumber) {
        System.out.println("Current balance: $" + accountBalance);
    }

    public void depositAmount(long accountNumber, double amount) {
       accountBalance = accountBalance +  amount;
       System.out.println("Deposited $" + amount + " into account " + accountNumber);
       System.out.println("New balance: $" + accountBalance);
    }

    public void withdrawAmount(long accountNumber, double amount) {
        if (accountBalance >= amount) {
            accountBalance = accountBalance - amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            System.out.println("New balance: $" + accountBalance);
        }
        else {
            System.out.println("Insufficient Account Balance");
        }

    }

    public static void main(String[] args) {
        BankDemo bankDemo = new BankDemo(12345,9876543.50);

        bankDemo.currentBalance(12345);
        bankDemo.depositAmount(12345,100000);
        bankDemo.withdrawAmount(12345,50000);
    }
}
