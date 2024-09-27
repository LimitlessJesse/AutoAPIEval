import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ValueRange_2 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(0, 100);
        boolean isIntValue = range.isIntValue(ChronoField.YEAR);
        System.out.println(isIntValue);
    }
}
