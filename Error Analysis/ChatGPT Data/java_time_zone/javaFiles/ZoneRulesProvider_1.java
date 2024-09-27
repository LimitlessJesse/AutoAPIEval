import java.time.zone.ZoneRulesProvider;
import java.util.Set;

public class ZoneRulesProvider_1 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneRulesProvider.getAvailableZoneIds();
        
        System.out.println("Available Zone IDs:");
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }
}
