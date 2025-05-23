public class PacientLegacyAdapter implements IPacientDTO {

    private final PacientLegacy legacy;

    public PacientLegacyAdapter(PacientLegacy legacy) {
        this.legacy = legacy;
    }

    @Override
    public String getNume() {
        return legacy.getFullName();
    }

    @Override
    public int getBirthYear() {
        return legacy.getBirthYear();
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Adapter -> Pacient: " + getNume() + ", anul nasterii: " + getBirthYear());
    }
}
