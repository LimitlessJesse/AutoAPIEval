import java.time.DayOfWeek;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeekFields_4 {
    public static void main(String[] args) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        DayOfWeek dayOfWeek = weekFields.dayOfWeek();
        System.out.println(dayOfWeek);
    }
}
