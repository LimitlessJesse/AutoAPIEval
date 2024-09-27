import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_20 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // Adjust the date to the next Tuesday
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday: " + nextTuesday);

        // Adjust the date to the last day of the month
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of the month: " + lastDayOfMonth);
    }
}
