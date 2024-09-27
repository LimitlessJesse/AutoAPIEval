import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ZonedDateTime_27 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        // Print the original ZonedDateTime
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Adjust the ZonedDateTime to the next day
        ZonedDateTime nextDay = zonedDateTime.with(TemporalAdjusters.next(ChronoUnit.DAYS));

        // Print the adjusted ZonedDateTime
        System.out.println("ZonedDateTime adjusted to the next day: " + nextDay);
    }
}
