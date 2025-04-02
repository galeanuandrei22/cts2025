public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if(paymentStrategy == null) {
            throw new RuntimeException("Metoda de plata nesetata");
        }
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.setPaymentStrategy(PaymentStrategyFactory.createPayment("card"));
        service.pay(500);

        service.setPaymentStrategy(PaymentStrategyFactory.createPayment("paypal"));
        service.pay(485.92);

        service.setPaymentStrategy(PaymentStrategyFactory.createPayment("googlepay"));
        service.pay(785.96);
    }
}
