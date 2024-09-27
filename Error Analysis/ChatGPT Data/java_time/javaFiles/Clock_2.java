import java.time.Clock;
import java.time.ZoneId;

public class Clock_2 {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        Clock clockWithZone = clock.withZone(ZoneId.systemDefault());
        System.out.println(clockWithZone.instant());
    }
}
