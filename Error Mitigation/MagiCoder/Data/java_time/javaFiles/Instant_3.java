import java.time.Instant;

public class Instant_3 {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(1000000000, 123456789);
        System.out.println(instant);
    }
}
