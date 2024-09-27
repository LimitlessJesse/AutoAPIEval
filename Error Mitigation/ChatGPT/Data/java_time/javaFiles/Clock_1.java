import java.time.Clock;
import java.time.ZoneId;

public class Clock_1 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        ZoneId zone = clock.getZone();
        System.out.println("Time zone being used: " + zone);
    }
}
