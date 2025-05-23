import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] tipuriOrgane = {"Inima", "Plamani", "Ficat", "Rinichi"};
        List<OrganPlacement> harta = new ArrayList<>();
        Random rand = new Random(42);

        for(int i = 0; i < 10; i++) {
            String organ = tipuriOrgane[i % tipuriOrgane.length];
            int x = rand.nextInt(500);
            int y = rand.nextInt(500);
            harta.add(new OrganPlacement(organ, x, y));
        }

        System.out.println("Redare harta anatomica");
        harta.forEach(OrganPlacement::render);
        System.out.println("\nNumar de obiecte OrganShape unice instantiate: " + OrganShapeFactory.getTotalShape());
    }
}
