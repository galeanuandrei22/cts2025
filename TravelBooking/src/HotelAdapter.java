public class HotelAdapter {
    private HotelSystem hotelSystem;

    public HotelAdapter(HotelSystem hotelSystem) {
        this.hotelSystem = hotelSystem;
    }

    public void bookHotel(String destination, String startDate, String endDate) {
        hotelSystem.findHotels(destination, startDate, endDate);
        hotelSystem.bookHotel();
    }
}
