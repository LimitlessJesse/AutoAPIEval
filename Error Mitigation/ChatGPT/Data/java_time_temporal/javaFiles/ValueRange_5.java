import java.time.temporal.ValueRange;

public class ValueRange_5 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 10);
        long value = 5;
        boolean isValid = range.isValidIntValue(value);
        System.out.println("Is value valid and fits in an int? " + isValid);
    }
}
