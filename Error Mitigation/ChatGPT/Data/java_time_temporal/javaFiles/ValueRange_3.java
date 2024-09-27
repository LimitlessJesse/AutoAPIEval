import java.time.temporal.ValueRange;

public class ValueRange_3 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 31);
        boolean isFixed = range.isFixed();
        System.out.println("Is the value range fixed? " + isFixed);
    }
}
