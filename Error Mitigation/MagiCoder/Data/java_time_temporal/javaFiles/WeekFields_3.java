import java.time.temporal.WeekFields;

public class WeekFields_3 {
    public static void main(String[] args) {
        WeekFields weekFields = WeekFields.of(java.time.DayOfWeek.MONDAY, 1);
        int minimalDaysInFirstWeek = weekFields.getMinimalDaysInFirstWeek();
        System.out.println("Minimal days in first week: " + minimalDaysInFirstWeek);
    }
}
