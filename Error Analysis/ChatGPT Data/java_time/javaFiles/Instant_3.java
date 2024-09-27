import java.time.Instant;

public class Instant_3 {
    public static void main(String[] args) {
        Instant currentInstant = Instant.now();
        System.out.println("Current Instant: " + currentInstant);

        long secondsToSubtract = 3600;
        Instant newInstant = currentInstant.minusSeconds(secondsToSubtract);
        System.out.println("Instant after subtracting 1 hour: " + newInstant);
    }
}
