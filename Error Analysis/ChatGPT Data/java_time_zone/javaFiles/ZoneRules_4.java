import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneRules_4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.UTC;
        ZoneRules zoneRules = ZoneRules.of(offset);
        boolean isValid = zoneRules.isValidOffset(localDateTime, offset);
        System.out.println("Is valid offset: " + isValid);
    }
}
