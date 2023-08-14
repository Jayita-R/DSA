package lambdatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main {
    private int field;
    public Predicate<Hotel> getLambdaExp(){
        int PRICE=2000;
        List<Integer> ar=new ArrayList<>();
        Predicate<Hotel> lambdaExp = hotel -> {
            return hotel.getPricePerNight()<=ar.size();
        };
        ar.add(1);
        //ar=new ArrayList<>();

        return lambdaExp;
    }
    public static void main(String[] args) {



        HotelService hotelService=new HotelService();

       /* List<Hotel> hotels=hotelService.filterHotels(new HotelFilteringCondition(){
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getPricePerNight()<=2000;
            }
        });*/

       /* HotelFilteringCondition lambdaExp=hotel -> hotel.getPricePerNight()<=2000;
        List<Hotel> hotels=hotelService.filterHotels(lambdaExp);
        System.out.println("List of hotels which price is less than 2000:"+hotels);*/

        Main main=new Main();
        Predicate<Hotel> lambdaExp=main.getLambdaExp();
        hotelService.filterHotels(lambdaExp);

        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        Collections.sort(lst,(a,b)->{return b-a;});
        System.out.println(lst);

        /*Predicate<Integer> divBy2= no -> no%2==0;
        Predicate<Integer> divBy3= no -> no%3==0;

        Predicate<Integer> divBy6= divBy2.and(divBy3);
        System.out.println(divBy6.test(6));*/

        IntPredicate divBy4= no -> no%4==0;
        IntPredicate divBy8= no -> no%8==0;

        IntPredicate divBy16= divBy4.and(divBy8);
        System.out.println(divBy16.test(16));

        Consumer<Integer> consumer=a-> System.out.println(a);
        lst.forEach(consumer);

        DoubleSupplier supplier=()->Math.random();
        System.out.println(supplier.getAsDouble());

        Function<String,Integer> strToLenMap= string->string.length();
        Integer len=strToLenMap.apply("Jayita");
        System.out.println(len);

        Function<Integer,Integer> squares=a->a*a;
        Function<Integer,Integer> addOne=a->a+1;

        Integer res=squares.andThen(addOne).andThen(squares).apply(3);
        System.out.println(res);

        /*List<Hotel> fiveStarHotels=hotelService.filterHotels(new HotelFilteringCondition(){
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getHotelType()==HotelType.FIVE_STAR;
            }
        });
        System.out.println("List of hotels which are 5 Star:"+fiveStarHotels);*/

        /*Passing functions in Java
        1. Create an interface
        2. instantiate a class that implements the interface
        3. implement the method of the interface, where the method body=function body which you wanted to pass as parameter
        4. pass an object of the concrete implementation of the interface
         */
    }
}
