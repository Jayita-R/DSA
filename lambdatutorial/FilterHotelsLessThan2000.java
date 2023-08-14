package lambdatutorial;

public class FilterHotelsLessThan2000 implements HotelFilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight()<=2000;
    }
}
