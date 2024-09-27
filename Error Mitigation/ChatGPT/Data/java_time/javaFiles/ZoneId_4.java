import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneId_4 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZoneRules rules = zoneId.getRules();
        System.out.println(rules);
    }
}
