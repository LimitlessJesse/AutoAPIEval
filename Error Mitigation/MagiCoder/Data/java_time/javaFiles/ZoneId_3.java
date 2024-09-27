import java.time.ZoneId;
import java.util.Set;

public class ZoneId_3 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }
}
