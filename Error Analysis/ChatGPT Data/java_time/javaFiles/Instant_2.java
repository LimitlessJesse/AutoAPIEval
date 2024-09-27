import java.time.Instant;

public class Instant_2 {
    public static void main(String[] args) {
        Instant currentInstant = Instant.now();
        Instant newInstant = currentInstant.plusSeconds(10);
        
        System.out.println("Current Instant: " + currentInstant);
        System.out.println("New Instant after adding 10 seconds: " + newInstant);
    }
}
