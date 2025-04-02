public class NotificationService {
    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notifyUser(String channel, String message) {
        Notification notification = factory.createNotification(channel);
        notification.sendNotification(message);
    }

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService notificationService = new NotificationService(factory);

        notificationService.notifyUser("email", "Acesta este un e-mail");
        notificationService.notifyUser("sms", "Acesta este un sms");
        notificationService.notifyUser("push", "Aceasta este o notificare");
    }
}
