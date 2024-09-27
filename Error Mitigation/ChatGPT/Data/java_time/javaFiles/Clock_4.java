import java.time.Clock;
import java.time.ZoneId;

public class Clock_4 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Clock newClock = clock.withZone(ZoneId.of("America/New_York"));
        System.out.println("Original Clock: " + clock.instant());
        System.out.println("New Clock with Zone America/New_York: " + newClock.instant());
    }
}
