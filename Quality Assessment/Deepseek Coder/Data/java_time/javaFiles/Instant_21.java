import java.time.Instant;

public class Instant_21 {
    public static void main(String[] args) {
        String text = "2022-01-01T00:00:00Z";
        Instant instant = Instant.parse(text);
        System.out.println(instant);
    }
}
