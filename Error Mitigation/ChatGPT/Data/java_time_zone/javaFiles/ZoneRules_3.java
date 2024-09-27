import java.time.zone.ZoneRules;

public class ZoneRules_3 {
    public static void main(String[] args) {
        ZoneRules zoneRules = ZoneRules.of("Europe/London");
        boolean fixedOffset = zoneRules.isFixedOffset();
        System.out.println("Is fixed offset: " + fixedOffset);
    }
}
