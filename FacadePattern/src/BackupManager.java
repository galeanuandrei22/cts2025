public class BackupManager {
    private final ExportSchema schema = new ExportSchema();
    private final ExportData data = new ExportData();
    private final CompressArchive compressor = new CompressArchive();
    private final UploadFTP ftp = new UploadFTP();

    public void realizeazaBackup(String dbName, String ftpServer) {
        System.out.println("Se incepe backup pentru " + dbName);
        schema.export(dbName);
        data.export(dbName);
        compressor.compress(dbName);
        ftp.upload(dbName, ftpServer);
        System.out.println("backup finalizat pentru " + dbName);
    }
}
