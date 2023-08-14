package lambdatutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HotelService {
    List<Hotel> hotels=new ArrayList<>();
    public HotelService(){
        hotels.add(new Hotel(2000,2,HotelType.THREE_STAR));
        hotels.add(new Hotel(1000,1,HotelType.THREE_STAR));
        hotels.add(new Hotel(10000,4,HotelType.FOUR_STAR));
        hotels.add(new Hotel(20000,5,HotelType.FIVE_STAR));
        hotels.add(new Hotel(5000,3,HotelType.FOUR_STAR));

    }

   /* private boolean isHotelLessThan(int price, Hotel hotel) {
        return hotel.getPricePerNight()<=price;
    }
    public List<Hotel> filterHotelsLessThan(int price){
        List<Hotel> filteredHotels=new ArrayList<>();
        for(Hotel hotel:hotels)
            if(isHotelLessThan(price,hotel))
                filteredHotels.add(hotel);

        return filteredHotels;
    }

    private boolean isHotel5star(Hotel hotel) {
        return hotel.getHotelType()==HotelType.FIVE_STAR;
    }*/
    //Predicate is the in-built functional Interface

    public List<Hotel> filterHotels(Predicate<Hotel> hotelFilteringCondition){
        List<Hotel> filteredHotels=new ArrayList<>();
        for(Hotel hotel:hotels)
            if(hotelFilteringCondition.test(hotel))
                filteredHotels.add(hotel);

        return filteredHotels;
    }




}
