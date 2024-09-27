import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class DateTimeFormatterBuilder_4 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendValue(ChronoField.DAY_OF_MONTH, 2);
    }
}
