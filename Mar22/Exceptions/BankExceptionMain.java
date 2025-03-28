package Mar22.Exceptions;

public class BankExceptionMain {
    public static void main(String[] args) {
        BankException bankException = new BankException();
        bankException.balance = 150000;

        double newBalance = 0;

        try {
            newBalance = bankException.withdrawAmt("101", 200000);
        }
        catch(InsufficientBalanceException e){
            e.printStackTrace();
        }

        System.out.println("Balance after withdrawal: "+newBalance);
    }
}
