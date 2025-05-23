public class OrganShape {
    private final String organType;
    private final String vectorData;

    public OrganShape(String organType) {
        this.organType = organType;
        this.vectorData = "VECTOR_DATA_FOR" + organType;
    }

    public void draw(int x, int y) {
        System.out.printf("Draw: %s la pozitia (%d, %d) cu date: %s%n", organType, x, y, vectorData);
    }

    public String getOrganType() {
        return organType;
    }
}
