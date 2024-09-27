import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_24 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Subtract 30 minutes
        ZonedDateTime newZonedDateTime = zonedDateTime.minusMinutes(30);
        System.out.println("ZonedDateTime after subtracting 30 minutes: " + newZonedDateTime);
    }
}
