package Mar15;

public class Paypal extends Payment{
    @Override
    public void makePayment(double amount, String paymentType) {
        System.out.println("Payment via Paypal " + amount);
    }
}
