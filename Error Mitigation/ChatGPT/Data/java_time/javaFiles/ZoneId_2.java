import java.time.ZoneId;
import java.util.Set;

public class ZoneId_2 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
    }
}
