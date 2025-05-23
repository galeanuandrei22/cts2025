import java.util.HashMap;
import java.util.Map;

public class OrganShapeFactory {
    private static final Map<String, OrganShape> shapes = new HashMap<>();

    public static OrganShape getOrganShape(String organType) {
        shapes.computeIfAbsent(organType, OrganShape::new);
        return shapes.get(organType);
    }

    public static int getTotalShape() {
        return shapes.size();
    }
}
