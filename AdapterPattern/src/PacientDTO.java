public class PacientDTO implements IPacientDTO {

   private final String nume;
   private final int birthYear;

    public PacientDTO(String nume, int birthYear) {
        this.nume = nume;
        this.birthYear = birthYear;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("DTO -> Pacient: " + nume + ", anul nasterii: " + birthYear);
    }
}
