import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Instant_7 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Original Instant: " + instant);

        Instant truncatedInstant = instant.truncatedTo(ChronoUnit.SECONDS);
        System.out.println("Truncated Instant: " + truncatedInstant);
    }
}
