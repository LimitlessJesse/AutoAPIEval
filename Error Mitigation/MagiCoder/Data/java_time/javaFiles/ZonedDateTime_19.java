import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTime_19 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Subtract 2 years
        ZonedDateTime result = zdt.minusYears(2);

        // Print the result
        System.out.println(result);
    }
}
