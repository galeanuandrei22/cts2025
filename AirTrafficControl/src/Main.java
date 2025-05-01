public class Main {
    public static void main(String[] args) {
        ControlTower turn = new ControlTower();

        Airplane avion1 = new CommercialAirplane(turn, "RO201");
        Airplane avion2 = new PrivateAirplane(turn, "YR-JVC");

        avion1.requestLanding();
        avion2.requestLanding();
    }
}
