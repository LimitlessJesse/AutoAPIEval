import java.time.Instant;

public class Instant_4 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        long seconds = 5;
        Instant instantMinusSeconds = instant.minusSeconds(seconds);
        System.out.println("Instant minus " + seconds + " seconds: " + instantMinusSeconds);
    }
}
