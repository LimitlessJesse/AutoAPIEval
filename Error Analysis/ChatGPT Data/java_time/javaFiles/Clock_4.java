import java.time.Clock;

public class Clock_4 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println("Current time in milliseconds: " + millis);
    }
}
