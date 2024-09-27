import java.time.Instant;

public class Instant_1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        long epochSecond = instant.getEpochSecond();
        System.out.println("Epoch second: " + epochSecond);
    }
}
