import java.time.temporal.ValueRange;

public class ValueRange_3 {
    public static void main(String[] args) {
        java.time.temporal.ValueRange range = java.time.temporal.ValueRange.of(1, 10);
        long maxValue = range.getMaximum();
        System.out.println("Maximum value in range: " + maxValue);
    }
}
