import java.time.DayOfWeek;
import java.time.temporal.WeekFields;

public class WeekFields_2 {
    public static void main(String[] args) {
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 4);
        System.out.println("First day of week: " + weekFields.getFirstDayOfWeek());
        System.out.println("Minimal days in first week: " + weekFields.getMinimalDaysInFirstWeek());
    }
}
