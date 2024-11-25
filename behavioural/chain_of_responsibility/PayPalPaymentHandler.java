package behavioural.chain_of_responsibility;

public class PayPalPaymentHandler extends PaymentHandler{
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("Paid using PayPal: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
