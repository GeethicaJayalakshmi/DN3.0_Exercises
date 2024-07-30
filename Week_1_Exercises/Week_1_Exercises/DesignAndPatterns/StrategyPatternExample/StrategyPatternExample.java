package StrategyPatternExample;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("Geethica Jayalakshmi", "123245678901346", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(100);

        // Paying with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("geethica.20@gmail", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200);
    }
}
