import java.time.Instant;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;

public class ZoneRules_1 {
    public static void main(String[] args) {
        ZoneRules rules = ZoneRules.ofUTC();
        Instant instant = Instant.now();
        
        ZoneOffsetTransition transition = rules.nextTransition(instant);
        System.out.println("Next transition: " + transition);
    }
}
