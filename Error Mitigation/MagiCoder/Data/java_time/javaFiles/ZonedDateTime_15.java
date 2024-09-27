import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_15 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Add 2 hours to the ZonedDateTime
        ZonedDateTime zonedDateTimePlus2Hours = zonedDateTime.plusHours(2);
        System.out.println("ZonedDateTime plus 2 hours: " + zonedDateTimePlus2Hours);
    }
}
