import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class HijrahDate_3 {
    public static void main(String[] args) {
        // Create a HijrahDate
        HijrahDate date = HijrahDate.now();

        // Create a TemporalAdjuster that adds 10 days to the date
        TemporalAdjuster adjuster = TemporalAdjusters.ofDateAdjuster(temporal -> temporal.plus(10, ChronoField.DAY_OF_MONTH));

        // Apply the adjuster to the date
        HijrahDate adjustedDate = date.with(adjuster);

        // Print the original date and the adjusted date
        System.out.println("Original date: " + date);
        System.out.println("Adjusted date: " + adjustedDate);
    }
}
