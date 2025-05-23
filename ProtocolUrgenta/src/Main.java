public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Ion Popescu", 110, 80);
        Pacient p2 = new Pacient("Maria Ionescu", 85, 140);

        ProtocolUrgenta spitalStat = new SpitalStat();
        ProtocolUrgenta spitalPrivat = new SpitalPrivat();

        System.out.println("=== Caz Spital de Stat ===");
        spitalStat.trateazaCazUrgenta(p1);
        spitalStat.trateazaCazUrgenta(p2);

        System.out.println("\n=== Caz Spital Privat ===");
        spitalPrivat.trateazaCazUrgenta(p1);
        spitalPrivat.trateazaCazUrgenta(p2);
    }
}
