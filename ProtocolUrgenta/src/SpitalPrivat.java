public class SpitalPrivat extends ProtocolUrgenta {

    @Override
    protected void verificaSemneVitale(Pacient p) {
        System.out.println("[PRIVAT] Monitorizare digitală a semnelor vitale pentru " + p.getNume());
    }

    @Override
    protected boolean areSemneGrave(Pacient p) {
        return p.getTensiune() < 100 || p.getPuls() > 120;
    }

    @Override
    protected void cheamaEchipaDeInterventie(Pacient p) {
        System.out.println("[PRIVAT] Echipa mobilă de elită este alertată pentru " + p.getNume());
    }

    @Override
    protected void cautaLocInternare(Pacient p) {
        System.out.println("[PRIVAT] Se verifică disponibilitatea în sistemul privat și parteneri.");
    }

    @Override
    protected void trimiteLaMedicDeFamilie(Pacient p) {
        System.out.println("[PRIVAT] Programare automată la medicul afiliat pentru " + p.getNume());
    }
}
