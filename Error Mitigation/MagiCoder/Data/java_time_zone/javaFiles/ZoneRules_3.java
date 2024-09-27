import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneRules_3 {
    public static void main(String[] args) {
        // Create a ZoneRules object
        ZoneRules zoneRules = ZoneRules.of("America/New_York");

        // Create a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.now();

        // Get the offset
        ZoneOffset offset = zoneRules.getOffset(localDateTime);

        // Print the offset
        System.out.println("Offset: " + offset);
    }
}
