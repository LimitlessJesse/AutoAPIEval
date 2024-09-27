import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_5 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Use the withDayOfMonth method
        ZonedDateTime newZonedDateTime = zonedDateTime.withDayOfMonth(28);

        // Print the new ZonedDateTime
        System.out.println(newZonedDateTime);
    }
}
