import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTime_13 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        // Add 2 weeks to the ZonedDateTime
        ZonedDateTime zdtPlus2Weeks = zdt.plusWeeks(2);

        // Print the result
        System.out.println("Original ZonedDateTime: " + zdt);
        System.out.println("ZonedDateTime plus 2 weeks: " + zdtPlus2Weeks);
    }
}
