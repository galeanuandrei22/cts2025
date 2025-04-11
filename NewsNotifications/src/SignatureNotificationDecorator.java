public class SignatureNotificationDecorator extends NotificationDecorator {
    private String signature;

    public SignatureNotificationDecorator(Notification notification, String signature) {
        super(notification);
        this.signature = signature;
    }

    @Override
    public String getMessage() {
        return notification.getMessage() + "\n— " + signature;
    }
}
