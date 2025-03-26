package Mar15;

public class Payment {
    private double amount;
    private boolean didMakePayment;
    private String paymentType;

    public Payment() {
    }

    public Payment(double amount, String paymentType) {
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public void makePayment(double amount, String paymentType) {
        if (this.amount == amount) {
            this.didMakePayment = true;
            System.out.println("Payment via " +paymentType+ " was successful");
        } else {
            System.out.println("Payment not succesful");
        }

    }

}
