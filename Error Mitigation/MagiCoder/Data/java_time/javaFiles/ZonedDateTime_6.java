import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTime_6 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zdt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        // Change the hour of the ZonedDateTime
        ZonedDateTime newZdt = zdt.withHour(10);
        System.out.println("ZonedDateTime with changed hour: " + newZdt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
