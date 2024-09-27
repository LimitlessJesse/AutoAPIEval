import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_21 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Subtract 2 weeks
        ZonedDateTime newZonedDateTime = zonedDateTime.minusWeeks(2);
        System.out.println("ZonedDateTime after subtracting 2 weeks: " + newZonedDateTime);
    }
}
