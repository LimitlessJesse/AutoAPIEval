import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneRules_3 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneRules zoneRules = zoneId.getRules();
        boolean isFixedOffset = zoneRules.isFixedOffset();
        System.out.println("Is Fixed Offset: " + isFixedOffset);
    }
}
