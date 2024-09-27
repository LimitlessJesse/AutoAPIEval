import java.time.temporal.ValueRange;

public class ValueRange_2 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 10);
        long minValue = range.getMinimum();
        System.out.println("Minimum value: " + minValue);
    }
}
