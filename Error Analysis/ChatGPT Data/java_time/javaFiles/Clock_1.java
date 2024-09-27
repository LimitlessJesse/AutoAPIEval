import java.time.Clock;
import java.time.ZoneId;

public class Clock_1 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        ZoneId zoneId = clock.getZone();
        System.out.println(zoneId);
    }
}
