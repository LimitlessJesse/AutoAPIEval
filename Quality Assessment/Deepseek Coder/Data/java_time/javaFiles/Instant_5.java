import java.time.Instant;

public class Instant_5 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        Instant instantPlusNanos = instant.plusNanos(1000_000_000);
        System.out.println("Instant after adding 1000_000_000 nanoseconds: " + instantPlusNanos);
    }
}
