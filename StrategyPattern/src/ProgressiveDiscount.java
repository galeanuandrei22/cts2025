public class ProgressiveDiscount implements DiscountStrategy {
    @Override
    public double calculeazaDisconunt(double total) {
        double discount = 0;
        double rest = total;

        if(rest <= 100) {
            return rest * 0.05;
        }

        discount += 100 * 0.05;
        rest -= 100;

        if(rest <= 200) {
            return discount + rest * 0.10;
        }

        discount += 200 * 0.10;
        rest -= 200;

        discount += rest * 0.15;
        return discount;
    }
}
