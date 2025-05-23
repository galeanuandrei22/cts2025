public class RequestConcediu {
    private final String nume;
    private final int zile;

    public RequestConcediu(String nume, int zile) {
        this.nume = nume;
        this.zile = zile;
    }

    public String getNume() {
        return nume;
    }

    public int getZile() {
        return zile;
    }
}
