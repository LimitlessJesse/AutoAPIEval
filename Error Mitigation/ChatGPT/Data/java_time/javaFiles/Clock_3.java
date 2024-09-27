import java.time.Clock;

public class Clock_3 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println("Current millisecond instant: " + millis);
    }
}
