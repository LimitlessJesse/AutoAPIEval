import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_10 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Original ZonedDateTime: " + zdt);

        // Change the time zone and retain the instant
        ZonedDateTime zdtNew = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime in New York: " + zdtNew);
    }
}
