package Mar22.Exceptions;

public class BankException {
    double balance;
    String accNo;

    public double checkBalance(String accNo, double withdrawAmt){
        return balance;
    }

    public double withdrawAmt(String accNo, double withdrawAmt) throws InsufficientBalanceException{
        if (withdrawAmt > balance) {
            throw new InsufficientBalanceException("You don't have sufficient balance");
        }
        else {
            return balance-withdrawAmt;
        }
    }

    public double deposit(String accNo, double depositAmt){
        return balance+depositAmt;
    }
}
