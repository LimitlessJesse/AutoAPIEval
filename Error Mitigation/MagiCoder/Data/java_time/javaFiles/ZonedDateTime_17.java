import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_17 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Add 10 seconds to the ZonedDateTime
        ZonedDateTime zonedDateTimePlus10Seconds = zonedDateTime.plusSeconds(10);
        System.out.println("ZonedDateTime after adding 10 seconds: " + zonedDateTimePlus10Seconds);
    }
}
