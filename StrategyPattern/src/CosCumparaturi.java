import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi {
    private final List<Double> produse = new ArrayList<>();
    private DiscountStrategy strategy;

    public CosCumparaturi(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void adaugaProdus(double pret) {
        produse.add(pret);
    }

    public double getTotal() {
        return produse.stream().mapToDouble(Double::doubleValue).sum();
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculeazaTotalCuDiscount() {
        double total = getTotal();
        double discount = strategy.calculeazaDisconunt(total);
        return total - discount;
    }
}
