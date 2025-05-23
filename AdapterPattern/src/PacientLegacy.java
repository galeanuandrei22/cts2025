public class PacientLegacy {
    private final String fullName;
    private final int birthYear;

    public PacientLegacy(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
