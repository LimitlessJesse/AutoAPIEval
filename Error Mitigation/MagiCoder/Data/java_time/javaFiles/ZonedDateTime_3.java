import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_3 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Use the withYear method
        ZonedDateTime newZdt = zdt.withYear(2023);

        // Print the original and new ZonedDateTime objects
        System.out.println("Original ZonedDateTime: " + zdt);
        System.out.println("ZonedDateTime with new year: " + newZdt);
    }
}
