import java.time.chrono.HijrahDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class HijrahDate_3 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now(); // Get the current date in Hijrah calendar system
        
        // Adjust the date to July
        date = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);
        
        // Adjust the date to the last day of the month
        date = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        
        // Adjust the date to the next Wednesday
        date = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(date);
    }
}
