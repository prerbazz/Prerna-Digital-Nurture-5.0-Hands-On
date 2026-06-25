public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor pay1=
                new PayPalAdapter(new PayPalGateway());
        PaymentProcessor pay2=
                new StripeAdapter(new StripeGateway());
        pay1.processPayment(2500);
        pay2.processPayment(4000);
    }
}