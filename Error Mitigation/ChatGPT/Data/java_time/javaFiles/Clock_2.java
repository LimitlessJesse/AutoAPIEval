import java.time.Clock;
import java.time.Instant;

public class Clock_2 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Instant currentInstant = clock.instant();
        System.out.println("Current Instant: " + currentInstant);
    }
}
