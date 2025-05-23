public class NotificatorCriptare extends NotificatorDecorator {
    public NotificatorCriptare(Notificator wrappee) {
        super(wrappee);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        String criptat = "[CRIPTAT]" + mesaj + "[/CRIPTAT]";
        super.trimiteMesaj(criptat);
    }
}
