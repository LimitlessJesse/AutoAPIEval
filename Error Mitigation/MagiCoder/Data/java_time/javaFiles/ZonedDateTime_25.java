import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTime_25 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Subtract 10 seconds from the ZonedDateTime
        ZonedDateTime newZonedDateTime = zonedDateTime.minusSeconds(10);
        System.out.println("ZonedDateTime after subtracting 10 seconds: " + newZonedDateTime);
    }
}
