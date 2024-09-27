import java.time.Instant;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;

public class ZoneRules_2 {
    public static void main(String[] args) {
        ZoneRules rules = ZoneRules.ofOffset(ZoneOffset.UTC);
        Instant instant = Instant.now();
        ZoneOffsetTransition transition = rules.nextTransition(instant);
        System.out.println("Next transition after " + instant + ": " + transition);
    }
}
