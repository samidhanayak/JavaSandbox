package Mar15;

public class Interac extends Payment{
    @Override
    public void makePayment(double amount, String paymentType) {
        System.out.println("Payment via Interac");
    }
}
