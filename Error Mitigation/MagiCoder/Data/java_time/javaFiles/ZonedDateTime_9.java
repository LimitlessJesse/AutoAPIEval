import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_9 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zdt);

        // Use withNano method to change the nano-of-second
        ZonedDateTime zdtWithNano = zdt.withNano(500);
        System.out.println("ZonedDateTime with changed nano-of-second: " + zdtWithNano);
    }
}
