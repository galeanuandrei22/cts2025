import java.util.List;

public class Offer implements Cloneable{
    private String title;
    private double discount;
    private String startDate;
    private String endDate;
    List<String> productCategories;
    boolean freeShipping;
    private boolean giftVoucher;

    Offer(OfferBuilder builder) {
        this.title = builder.title;
        this.discount = builder.discount;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.productCategories = builder.productCategories;
        this.freeShipping = builder.freeShipping;
        this.giftVoucher = builder.giftVoucher;
    }

    public void showDetails() {
        System.out.println("Oferta " + title);
        System.out.println("Discount " + discount + "%");
        System.out.println("Valabil " + startDate + " pana la " + endDate);
        System.out.println("Categorii " + productCategories);
        System.out.println("Livrare gratuita " + (freeShipping ? "Da" : "Nu"));
        System.out.println("Voucher cadou " + (giftVoucher ? "Da" : "Nu"));
    }

    @Override
    public Offer clone() {
        try {
            Offer cloned = (Offer) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class OfferBuilder {
        private String title;
        private double discount;
        private String startDate;
        private String endDate;
        private List<String> productCategories;
        private boolean freeShipping;
        private boolean giftVoucher;

        public OfferBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public OfferBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OfferBuilder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public OfferBuilder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public OfferBuilder setProductCategories(List<String> productCategories) {
            this.productCategories = productCategories;
            return this;
        }

        public OfferBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        public OfferBuilder setGiftVoucher(boolean giftVoucher) {
            this.giftVoucher = giftVoucher;
            return this;
        }

        public Offer build() {
            return new Offer(this);
        }
    }
}
