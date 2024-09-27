import java.time.Instant;

public class Instant_6 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        long nanos = 1000000000; // 1 second
        Instant instantMinusNanos = instant.minusNanos(nanos);
        System.out.println("Instant minus 1 second: " + instantMinusNanos);
    }
}
