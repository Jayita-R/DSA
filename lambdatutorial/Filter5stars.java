package lambdatutorial;

public class Filter5stars implements HotelFilteringCondition{

    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelType()==HotelType.FIVE_STAR;
    }
}
