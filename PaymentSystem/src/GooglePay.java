public class GooglePay implements PaymentStrategy {

    private String phoneNumber;

    public GooglePay(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Platit cu google pay ("+ phoneNumber + ") suma de: " + amount);
    }
}
