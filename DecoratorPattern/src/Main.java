public class Main {
    public static void main(String[] args) {
        Notificator baza = new NotificatorBaza();
        Notificator cript = new NotificatorCriptare(baza);
        System.out.println("Criptare");
        cript.trimiteMesaj("Salut boss");

        Notificator logStat = new NotificatorStatistica(new NotificatorLogging(baza));
        System.out.println("Logging + statistica");
        logStat.trimiteMesaj("Ai o noua notificare");
        logStat.trimiteMesaj("Reminder pentru intalnire");

        Notificator full = new NotificatorStatistica(new NotificatorLogging(new NotificatorCriptare(baza)));
        System.out.println("Criptare + logging + statistica");
        full.trimiteMesaj("mare specialist");
    }
}
