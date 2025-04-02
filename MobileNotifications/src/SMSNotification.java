public class SMSNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS trimis cu mesajul: " + message);
    }
}
