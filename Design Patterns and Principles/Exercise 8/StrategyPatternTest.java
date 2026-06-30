public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext payment=
                new PaymentContext(new CreditCardPayment());
        payment.makePayment(2500);
        payment.setStrategy(new PaypalPayment());
        payment.makePayment(1800);
    }
}