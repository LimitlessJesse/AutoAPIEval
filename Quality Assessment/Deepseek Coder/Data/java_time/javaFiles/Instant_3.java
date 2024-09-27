import java.time.Instant;

public class Instant_3 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        Instant instantPlus10Seconds = instant.plusSeconds(10);
        System.out.println("Instant after 10 seconds: " + instantPlus10Seconds);
    }
}
