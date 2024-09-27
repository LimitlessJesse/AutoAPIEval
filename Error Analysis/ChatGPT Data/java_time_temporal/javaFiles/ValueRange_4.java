import java.time.temporal.ValueRange;

public class ValueRange_4 {
    public static void main(String[] args) {
        boolean isValid = isValidIntValue(5L);
        System.out.println("Is valid integer value: " + isValid);
    }

    public static boolean isValidIntValue(long value) {
        ValueRange range = ValueRange.of(1, 10);
        return range.isValidIntValue(value);
    }
}
