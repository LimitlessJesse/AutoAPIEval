import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTime_45 {
    public static void main(String[] args) {
        // Create a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.now();

        // Print the original LocalDateTime
        System.out.println("Original LocalDateTime: " + localDateTime);

        // Adjust the LocalDateTime to the last day of the month
        LocalDateTime lastDayOfMonth = localDateTime.with(TemporalAdjusters.lastDayOfMonth());

        // Print the adjusted LocalDateTime
        System.out.println("Adjusted LocalDateTime: " + lastDayOfMonth);
    }
}
