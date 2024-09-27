import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_2 {
    public static void main(String[] args) {
        ZonedDateTime originalDateTime = ZonedDateTime.now();
        System.out.println("Original DateTime: " + originalDateTime);

        ZoneId newZone = ZoneId.of("America/New_York");
        ZonedDateTime newZonedDateTime = originalDateTime.withZoneSameLocal(newZone);
        System.out.println("New DateTime with Zone America/New_York: " + newZonedDateTime);
    }
}
