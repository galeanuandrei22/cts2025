public abstract class Airplane {
    protected AirTrafficControl control;
    protected String name;

    public Airplane(AirTrafficControl control, String name) {
        this.control = control;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void land() {
        deployLandingGear();
        adjustSpeed();
        touchdown();
        taxiToGate();
    }

    protected abstract void deployLandingGear();
    protected abstract void adjustSpeed();
    protected abstract void touchdown();

    protected void taxiToGate() {
        System.out.println(name + " se deplaseaza spre poarta indicata");
    }

    public void requestLanding() {
        control.requestLanding(this);
    }
}
