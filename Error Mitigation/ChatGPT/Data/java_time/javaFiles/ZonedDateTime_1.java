import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println("LocalDateTime part: " + localDateTime);
    }
}
