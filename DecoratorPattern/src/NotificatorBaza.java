public class NotificatorBaza implements Notificator {
    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("[Trimis] " + mesaj);
    }
}
