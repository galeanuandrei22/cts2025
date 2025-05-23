public abstract class  NotificatorDecorator implements Notificator {

    protected final Notificator wrappee;

    public NotificatorDecorator(Notificator wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        wrappee.trimiteMesaj(mesaj);
    }
}
