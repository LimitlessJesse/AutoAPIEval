import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTime_18 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original ZonedDateTime: " + zdt);

        ZonedDateTime zdtPlusNanos = zdt.plusNanos(1000000000);
        System.out.println("ZonedDateTime after adding 1 billion nanos: " + zdtPlusNanos);
    }
}
