import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_3 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZoneId zoneId = dateTime.getZone();
        System.out.println("ZoneId: " + zoneId);
    }
}
