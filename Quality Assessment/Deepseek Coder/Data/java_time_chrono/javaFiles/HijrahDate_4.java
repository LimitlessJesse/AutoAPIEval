import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;

public class HijrahDate_4 {
    public static void main(String[] args) {
        // Create a HijrahDate object
        HijrahDate date = HijrahDate.now();
        System.out.println("Original Date: " + date);

        // Use the with method to change the day of the month
        HijrahDate newDate = date.with(ChronoField.DAY_OF_MONTH, 15);
        System.out.println("New Date: " + newDate);
    }
}
