public class OrganPlacement {
    private final OrganShape shape;
    private final int x, y;

    public OrganPlacement(String organType, int x, int y) {
        this.shape = OrganShapeFactory.getOrganShape(organType);
        this.x = x;
        this.y = y;
    }

    public void render() {
        shape.draw(x, y);
    }
}
