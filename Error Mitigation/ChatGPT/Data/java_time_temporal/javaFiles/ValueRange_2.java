import java.time.temporal.ValueRange;

public class ValueRange_2 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 31);
        long minimum = range.getMinimum();
        System.out.println("Minimum value: " + minimum);
    }
}
