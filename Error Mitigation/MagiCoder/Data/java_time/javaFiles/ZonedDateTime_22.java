import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_22 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Subtract 5 days
        ZonedDateTime newZonedDateTime = zonedDateTime.minusDays(5);

        // Print the new ZonedDateTime
        System.out.println(newZonedDateTime);
    }
}
