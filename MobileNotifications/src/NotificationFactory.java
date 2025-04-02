public class NotificationFactory {
    public Notification createNotification(String channel) {
        switch (channel.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Metoda de notificare necunscuta: " + channel);
        }
    }
}
