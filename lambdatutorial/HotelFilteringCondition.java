package lambdatutorial;

@FunctionalInterface
public interface HotelFilteringCondition {
    abstract boolean test(Hotel hotel);
}
