public class Pacient {
    private String nume;
    private int tensiune;
    private int puls;

    public Pacient(String nume, int tensiune, int puls) {
        this.nume = nume;
        this.tensiune = tensiune;
        this.puls = puls;
    }

    public String getNume() {
        return nume;
    }

    public int getTensiune() {
        return tensiune;
    }

    public int getPuls() {
        return puls;
    }
}
