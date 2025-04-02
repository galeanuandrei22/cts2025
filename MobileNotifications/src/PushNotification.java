public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Notificare trimisa cu mesajul: " + message);
    }
}
