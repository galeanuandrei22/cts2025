import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements AirTrafficControl {
    private Queue<Airplane> landingQueue = new LinkedList<>();

    @Override
    public void requestLanding(Airplane airplane) {
        landingQueue.add(airplane);
        System.out.println(airplane.getName() + " solicita permisiune de aterizare");
        grantLandingPermission();
    }

    private void grantLandingPermission() {
        if(!landingQueue.isEmpty()) {
            Airplane nextPlane = landingQueue.poll();
            System.out.println("Se acord permisiunea de aterizare pentru: " + nextPlane.getName());
            nextPlane.land();
        }
    }
}
