import java.time.Instant;

public class Instant_5 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant future = now.plusSeconds(3600);
        System.out.println("Is future before now? " + future.isBefore(now));
    }
}
