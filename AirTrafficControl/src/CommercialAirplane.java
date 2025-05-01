public class CommercialAirplane extends Airplane {
   public CommercialAirplane(AirTrafficControl control, String name) {
       super(control, name);
   }

    @Override
    protected void deployLandingGear() {
        System.out.println(name + ": tren de aterizare deschis");
    }

    @Override
    protected void adjustSpeed() {
        System.out.println(name + ": viteza redusa la 200km/h");
    }

    @Override
    protected void touchdown() {
        System.out.println(name + ": aterizare lina");
    }
}
