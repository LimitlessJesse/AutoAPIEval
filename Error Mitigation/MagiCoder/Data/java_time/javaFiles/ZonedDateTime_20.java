import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_20 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 12, 31, 10, 15, 30, 0, ZoneId.of("Europe/Paris"));

        // Subtract 2 months
        ZonedDateTime result = zonedDateTime.minusMonths(2);

        // Print the result
        System.out.println(result);
    }
}
