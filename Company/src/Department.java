import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    private String departmentName;
    private List<Component> components = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void showDetails() {
        System.out.println("\nDepartament: " + departmentName);
        for(Component component : components) {
            component.showDetails();
        }
    }
}
