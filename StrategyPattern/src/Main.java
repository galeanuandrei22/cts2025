public class Main {
    public static void main(String[] args) {
        CosCumparaturi cos = new CosCumparaturi(new PercentDiscount(0.10));
        cos.adaugaProdus(100);
        cos.adaugaProdus(500);
        cos.adaugaProdus(45);
        cos.adaugaProdus(213);

        System.out.println("total brut: " + cos.getTotal());

        // Procent fix 10%
        cos.setStrategy(new PercentDiscount(0.10));
        System.out.printf("total dupa 10%% discount: %.2f%n",
                cos.calculeazaTotalCuDiscount());

        // Sumă fixă 50 lei
        cos.setStrategy(new FixedAmountDiscount(50));
        System.out.printf("Total dupa 50 lei discount: %.2f%n",
                cos.calculeazaTotalCuDiscount());

        // Discount progresiv
        cos.setStrategy(new ProgressiveDiscount());
        System.out.printf("total dupa discount progresiv: %.2f%n",
                cos.calculeazaTotalCuDiscount());
    }
}
