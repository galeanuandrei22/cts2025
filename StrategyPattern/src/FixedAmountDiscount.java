public class FixedAmountDiscount implements DiscountStrategy {
    private final double sumaFixa;

    public FixedAmountDiscount(double sumaFixa) {
        this.sumaFixa = sumaFixa;
    }

    @Override
    public double calculeazaDisconunt(double total) {
        return Math.min(sumaFixa, total);
    }
}
