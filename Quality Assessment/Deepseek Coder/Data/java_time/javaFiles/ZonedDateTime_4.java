import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_4 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        // Change the timezone
        ZonedDateTime newZonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("New ZonedDateTime: " + newZonedDateTime);
    }
}
