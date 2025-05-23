public class Main {
    public static void main(String[] args) {
        BackupManager manager = new BackupManager();
        String ftpServer = "ftp://server.ceva.ro";

        manager.realizeazaBackup("baza1", ftpServer);
        manager.realizeazaBackup("baza2", ftpServer);
    }
}
