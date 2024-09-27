import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_12 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Add 2 months to the ZonedDateTime
        ZonedDateTime newZdt = zdt.plusMonths(2);

        // Print the new ZonedDateTime
        System.out.println(newZdt);
    }
}
