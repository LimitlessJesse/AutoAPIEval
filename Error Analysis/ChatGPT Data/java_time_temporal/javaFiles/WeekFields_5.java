import java.time.temporal.WeekFields;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class WeekFields_5 {
    public static void main(String[] args) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        TemporalField weekOfMonth = weekFields.weekOfMonth();
        System.out.println(weekOfMonth);
    }
}
