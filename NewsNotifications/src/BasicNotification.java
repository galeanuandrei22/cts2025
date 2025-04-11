public class BasicNotification implements Notification {
    private String message;

    public BasicNotification(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
