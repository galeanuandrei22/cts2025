public abstract class ProtocolUrgenta {
    public final void trateazaCazUrgenta(Pacient pacient) {
        verificaSemneVitale(pacient);
        if(areSemneGrave(pacient)) {
            cheamaEchipaDeInterventie(pacient);
            cautaLocInternare(pacient);
        } else {
            trimiteLaMedicDeFamilie(pacient);
        }
    }

    protected abstract void verificaSemneVitale(Pacient pacient);
    protected abstract boolean areSemneGrave(Pacient pacient);
    protected abstract void cheamaEchipaDeInterventie(Pacient pacient);
    protected abstract void cautaLocInternare(Pacient pacient);
    protected abstract void trimiteLaMedicDeFamilie(Pacient pacient);
}
