import java.time.Instant;

public class Instant_2 {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(1000000000);
        System.out.println(instant);
    }
}
