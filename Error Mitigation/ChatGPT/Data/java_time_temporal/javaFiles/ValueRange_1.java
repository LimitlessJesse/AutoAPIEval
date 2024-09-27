import java.time.temporal.ValueRange;

public class ValueRange_1 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 31);
        long maximum = range.getMaximum();
        System.out.println("Maximum value: " + maximum);
    }
}
