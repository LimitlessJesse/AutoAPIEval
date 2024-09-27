import java.time.ZoneId;
import java.util.Set;

public class ZoneId_1 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("Available Zone Ids:");
        for(String id : zoneIds) {
            System.out.println(id);
        }
    }
}
