import java.time.Clock;
import java.time.Instant;

public class Instant_20 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Instant instant = Instant.now(clock);
        System.out.println(instant);
    }
}
