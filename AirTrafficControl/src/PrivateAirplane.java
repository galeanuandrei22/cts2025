public class PrivateAirplane extends Airplane {
    public PrivateAirplane(AirTrafficControl control, String name) {
        super(control, name);
    }

    @Override
    protected void deployLandingGear() {
        System.out.println(name + ": tren de aterizare deschis manual");
    }

    @Override
    protected void adjustSpeed() {
        System.out.println(name + ": viteza ajustata la 150 km/h");
    }

    @Override
    protected void touchdown() {
        System.out.println(name + ": aterizare usoara");
    }
}
