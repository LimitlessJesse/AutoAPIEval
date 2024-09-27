import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_16 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Add 10 minutes to the ZonedDateTime
        ZonedDateTime zonedDateTimePlus10Minutes = zonedDateTime.plusMinutes(10);
        System.out.println("ZonedDateTime after adding 10 minutes: " + zonedDateTimePlus10Minutes);
    }
}
