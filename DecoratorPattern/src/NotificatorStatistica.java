public class NotificatorStatistica extends NotificatorDecorator {
    private static int counter = 0;

    public NotificatorStatistica(Notificator wrappee) {
        super(wrappee);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        counter++;
        System.out.println("[STAT] Total mesaje trimise pana acum: " + counter);
        super.trimiteMesaj(mesaj);
    }
}
