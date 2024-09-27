import java.time.Instant;

public class Instant_2 {
    public static void main(String[] args) {
        long epochSecond = 1609459200; // 2021-01-01T00:00:00Z
        Instant instant = Instant.ofEpochSecond(epochSecond);
        System.out.println("Instant: " + instant);
    }
}
