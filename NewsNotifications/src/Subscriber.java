public class Subscriber implements Observer {
    private String username;

    public Subscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(username + " a primit " + message);
    }
}
