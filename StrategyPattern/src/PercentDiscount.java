public class PercentDiscount implements DiscountStrategy {

    private final double procent;

    public PercentDiscount(double procent) {
        this.procent = procent;
    }

    @Override
    public double calculeazaDisconunt(double total) {
        return total * procent;
    }
}
