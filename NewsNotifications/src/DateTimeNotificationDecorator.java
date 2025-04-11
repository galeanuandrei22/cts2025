import java.time.LocalDateTime;

public class DateTimeNotificationDecorator extends NotificationDecorator {
    public DateTimeNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getMessage() {
        return notification.getMessage() + " (" + LocalDateTime.now() + ")";
    }
}
