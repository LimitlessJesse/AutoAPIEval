import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_3 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
        ZoneId newZone = ZoneId.of("America/New_York");
        ZonedDateTime newDateTime = dateTime.withZoneSameInstant(newZone);
        
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("New DateTime with Zone: " + newDateTime);
    }
}
