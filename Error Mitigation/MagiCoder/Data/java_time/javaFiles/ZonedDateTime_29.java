import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class ZonedDateTime_29 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Change the day of the month to 20
        ZonedDateTime newZonedDateTime = zonedDateTime.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println("ZonedDateTime after changing the day of the month: " + newZonedDateTime);
    }
}
