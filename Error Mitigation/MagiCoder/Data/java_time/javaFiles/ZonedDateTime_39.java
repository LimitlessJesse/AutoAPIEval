import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_39 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("UTC"));

        // Create a Duration object
        Duration duration = Duration.ofHours(2);

        // Use the plus method
        ZonedDateTime newZonedDateTime = zonedDateTime.plus(duration);

        // Print the new ZonedDateTime
        System.out.println(newZonedDateTime);
    }
}
