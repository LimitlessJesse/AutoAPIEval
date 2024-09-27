import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_8 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Use the withSecond method
        ZonedDateTime newZonedDateTime = zonedDateTime.withSecond(30);

        // Print the new ZonedDateTime
        System.out.println(newZonedDateTime);
    }
}
