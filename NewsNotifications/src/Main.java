public class Main {
    public static void main(String[] args) {
        NewsAgency agentie = new NewsAgency();

        Observer user1 = new Subscriber("Ionica");
        Observer user2 = new Subscriber("Vasile");

        agentie.subscribe(user1);
        agentie.subscribe(user2);

        String titluArticol = "Accident A1";

        Notification notification = new BasicNotification("Articol nou: " + titluArticol);
        notification = new DateTimeNotificationDecorator(notification);
        notification = new SignatureNotificationDecorator(notification, "Mare reporter");

        agentie.notifyObservers(notification.getMessage());
    }
}
