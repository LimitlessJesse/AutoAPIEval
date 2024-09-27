import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;

public class ZoneRules_2 {
    public static void main(String[] args) {
        ZoneRules zoneRules = ZoneRules.of("Europe/London");
        ZoneOffsetTransition[] transitionsArray = zoneRules.getTransitions().toArray(new ZoneOffsetTransition[0]);
        for (ZoneOffsetTransition transition : transitionsArray) {
            System.out.println(transition);
        }
    }
}
