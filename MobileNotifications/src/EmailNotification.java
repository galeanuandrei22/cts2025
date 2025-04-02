public class EmailNotification  implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("E-mail trimis: " + message);
    }
}
