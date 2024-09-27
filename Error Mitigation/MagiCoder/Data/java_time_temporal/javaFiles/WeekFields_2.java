import java.time.DayOfWeek;
import java.time.temporal.WeekFields;

public class WeekFields_2 {
    public static void main(String[] args) {
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
        DayOfWeek firstDayOfWeek = weekFields.getFirstDayOfWeek();
        System.out.println("The first day of the week is: " + firstDayOfWeek);
    }
}
