import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;

public class ValueRange_5 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(Duration.of(1, ChronoUnit.HOURS), Duration.of(2, ChronoUnit.HOURS));
        System.out.println(range.isFixed());
    }
}
