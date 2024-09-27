import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_7 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Use withMinute method
        ZonedDateTime newZonedDateTime = zonedDateTime.withMinute(30);
        System.out.println("ZonedDateTime with new minute: " + newZonedDateTime);
    }
}
