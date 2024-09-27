import java.time.Clock;

public class Clock_5 {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
    }
}
