public class Main {
    public static void main(String[] args) {
        IPacientDTO dto1 = new PacientDTO("Ionut Miai", 1989);

        PacientLegacy leg1 = new PacientLegacy("vali vijelie", 2001);
        PacientLegacy leg2 = new PacientLegacy("florin salam", 1977);
        IPacientDTO dto2 = new PacientLegacyAdapter(leg1);
        IPacientDTO dto3= new PacientLegacyAdapter(leg2);

        dto1.afiseazaInfo();
        dto2.afiseazaInfo();
        dto3.afiseazaInfo();
    }
}
