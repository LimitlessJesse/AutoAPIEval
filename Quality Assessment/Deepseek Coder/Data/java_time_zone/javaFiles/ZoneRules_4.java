import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneRules_4 {
    public static void main(String[] args) {
        ZoneRules zoneRules = ZoneId.of("Asia/Kolkata").getRules();
        boolean isFixedOffset = zoneRules.isFixedOffset();
        System.out.println("Is the offset of this zone a fixed offset? " + isFixedOffset);
    }
}
