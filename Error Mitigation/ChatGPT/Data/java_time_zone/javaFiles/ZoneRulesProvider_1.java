import java.time.zone.ZoneRulesProvider;
import java.util.Set;

public class ZoneRulesProvider_1 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneRulesProvider.getAvailableZoneIds();
        System.out.println(zoneIds);
    }
}
