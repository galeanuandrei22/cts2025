public class FlightAdapter {
    private FlightSystem flightSystem;

    public FlightAdapter(FlightSystem flightSystem) {
        this.flightSystem = flightSystem;
    }

    public void bookFlight(String destination, String startDate, String endDate) {
        flightSystem.searchFlights("Bucuresti", destination, startDate, endDate);
        flightSystem.reserveFlight();
    }
}
