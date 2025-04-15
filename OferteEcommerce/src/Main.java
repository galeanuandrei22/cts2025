import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Offer springOffer = new Offer.OfferBuilder()
                .setTitle("reducere de primavara")
                .setDiscount(15)
                .setStartDate("2025-04-16")
                .setEndDate("2025-04-30")
                .setProductCategories(Arrays.asList("haine", "incaltari"))
                .setFreeShipping(true)
                .setGiftVoucher(false)
                .build();

        springOffer.showDetails();

        Offer clonedOffer = springOffer.clone();
        clonedOffer = new Offer.OfferBuilder()
                .setTitle("reducere extinsa de primavara")
                .setDiscount(25)
                .setStartDate("2025-05-01")
                .setEndDate("2025-05-10")
                .setProductCategories(clonedOffer.productCategories)
                .setFreeShipping(clonedOffer.freeShipping)
                .setGiftVoucher(true)
                .build();

        clonedOffer.showDetails();
    }
}
