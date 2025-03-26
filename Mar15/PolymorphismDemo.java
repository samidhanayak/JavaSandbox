package Mar15;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Payment payment = new Payment(200,"Payment");
        payment.makePayment(200,"Payment");

        CreditCard creditCard = new CreditCard();
        creditCard.makePayment(300,"credit card");

        Interac interac = new Interac();
        interac.makePayment(350,"interac");

        Paypal paypal = new Paypal();
        paypal.makePayment(400,"paypal");
    }
}
