import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_40 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("UTC"));

        // Create a Duration object
        Duration duration = Duration.ofHours(2);

        // Subtract the duration from the ZonedDateTime
        ZonedDateTime result = zdt.minus(duration);

        // Print the result
        System.out.println(result);
    }
}
