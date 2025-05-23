public class SpitalStat extends ProtocolUrgenta {
    @Override
    protected void verificaSemneVitale(Pacient pacient) {
        System.out.println("STAT: se verifica semnele vitale pentru: " + pacient.getNume());
    }

    @Override
    protected boolean areSemneGrave(Pacient pacient) {
        return pacient.getTensiune() < 90 | pacient.getPuls() > 130;
    }

    @Override
    protected void cheamaEchipaDeInterventie(Pacient pacient) {
        System.out.println("STAT: se cheama echipa de interventie pentru: " + pacient.getNume());
    }

    @Override
    protected void cautaLocInternare(Pacient pacient) {
        System.out.println("STAT: se cauta loc in spital..");
    }

    @Override
    protected void trimiteLaMedicDeFamilie(Pacient pacient) {
        System.out.println("STAT: pacientul " + pacient.getNume() + " e trimis la medicul de familie");
    }
}
