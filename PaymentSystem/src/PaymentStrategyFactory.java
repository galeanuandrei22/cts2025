public class PaymentStrategyFactory {
    public static PaymentStrategy createPayment(String type) {
        switch (type.toLowerCase()) {
            case "card":
                return new CardPayment("4561 4564 1234 8794", "345", "06/26");
            case "paypal":
                return new PaypalPayment("test@test.ro");
            case "googlepay":
                return new GooglePay("0723513789");
            default:
                throw new IllegalArgumentException("Tip de plata ncunoscut: " + type);
        }
    }
}
