public class CardPayment implements PaymentStrategy {

    private String cardNumber;
    private String cvv;
    private String expiry;

    public CardPayment(String cardNumber, String cvv, String expiry) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Ai platit cu cardul suma de: " + amount);
    }
}
