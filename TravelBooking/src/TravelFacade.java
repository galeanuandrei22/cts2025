public class TravelFacade implements TravelBooking {
    private FlightAdapter flightAdapter;
    private  HotelAdapter hotelAdapter;

    public TravelFacade() {
        flightAdapter = new FlightAdapter(new FlightSystem());
        hotelAdapter = new HotelAdapter(new HotelSystem());
    }

    @Override
    public void bookTrip(String destination, String startDate, String endDate) {
        flightAdapter.bookFlight(destination, startDate, endDate);
        hotelAdapter.bookHotel(destination, startDate, endDate);
        System.out.println("Rezervarea catre " + destination + " este completa.");
    }
}
