import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;

public class ZoneRules_4 {
    public static void main(String[] args) {
        ZoneRules rules = ZoneRules.ofOffset(ZoneOffset.UTC);
        System.out.println(rules.getTransitions());
    }
}
