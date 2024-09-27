import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_26 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));

        // Subtract 100000000 nanoseconds
        ZonedDateTime result = zdt.minusNanos(100000000);

        // Print the result
        System.out.println(result);
    }
}
