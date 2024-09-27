import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneRules_1 {
    public static void main(String[] args) {
        ZoneRules rules = ZoneRules.of(ZoneOffset.UTC);
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneOffset offset = rules.getOffset(dateTime);
        System.out.println("Offset for " + dateTime + ": " + offset);
    }
}
