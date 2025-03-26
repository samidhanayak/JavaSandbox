package Mar15;

public class CreditCard extends Payment{
    @Override
    public void makePayment(double amount, String paymentType) {
        System.out.println("Payment via credit card");
    }
}
