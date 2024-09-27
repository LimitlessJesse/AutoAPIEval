import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZoneId zoneId = zonedDateTime.getZone();
        System.out.println("Time zone: " + zoneId);
    }
}
