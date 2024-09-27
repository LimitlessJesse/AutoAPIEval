import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTime_5 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();
        System.out.println("OffsetDateTime: " + offsetDateTime);
    }
}
