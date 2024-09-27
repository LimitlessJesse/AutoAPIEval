import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;

public class HijrahDate_27 {
    public static void main(String[] args) {
        // Create a HijrahDate object
        HijrahDate date = HijrahDate.now();
        System.out.println("Original Date: " + date);

        // Change the year
        HijrahDate newDate = date.with(ChronoField.YEAR, 2022);
        System.out.println("Date after changing year: " + newDate);

        // Change the month
        newDate = newDate.with(ChronoField.MONTH_OF_YEAR, 12);
        System.out.println("Date after changing month: " + newDate);

        // Change the day of month
        newDate = newDate.with(ChronoField.DAY_OF_MONTH, 31);
        System.out.println("Date after changing day of month: " + newDate);
    }
}
