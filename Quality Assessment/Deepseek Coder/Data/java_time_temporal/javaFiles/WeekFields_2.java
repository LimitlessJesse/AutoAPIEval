import java.time.DayOfWeek;
import java.time.temporal.WeekFields;

public class WeekFields_2 {
    public static void main(String[] args) {
        DayOfWeek firstDayOfWeek = WeekFields.of(java.util.Locale.getDefault()).getFirstDayOfWeek();
        System.out.println("The first day of the week is: " + firstDayOfWeek);
    }
}
