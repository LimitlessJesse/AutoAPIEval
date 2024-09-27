import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_14 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Add 5 days to the ZonedDateTime
        ZonedDateTime newZonedDateTime = zonedDateTime.plusDays(5);
        System.out.println("ZonedDateTime after adding 5 days: " + newZonedDateTime);
    }
}
