public class NotificatorLogging extends NotificatorDecorator {
    public NotificatorLogging(Notificator wrappee) {
        super(wrappee);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("[LOG] Se trimite mesaj: " + mesaj);
        super.trimiteMesaj(mesaj);
    }
}
