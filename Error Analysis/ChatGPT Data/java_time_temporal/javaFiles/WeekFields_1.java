import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeekFields_1 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        WeekFields weekFields = WeekFields.of(locale);
        System.out.println(weekFields.getFirstDayOfWeek()); // Output: SUNDAY
        System.out.println(weekFields.getMinimalDaysInFirstWeek()); // Output: 1
    }
}
