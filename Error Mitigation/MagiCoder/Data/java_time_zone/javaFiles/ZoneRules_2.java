import java.time.Instant;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneRules_2 {
    public static void main(String[] args) {
        ZoneRules zoneRules = ZoneRules.of("America/New_York");
        Instant instant = Instant.now();
        ZoneOffset offset = zoneRules.getOffset(instant);
        System.out.println("The offset for the instant is: " + offset);
    }
}
