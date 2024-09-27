import java.time.Instant;

public class Instant_2 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        long nano = instant.getNano();
        System.out.println("Nano: " + nano);
    }
}
