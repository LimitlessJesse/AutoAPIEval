import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneOffsetTransitionRule;
import java.time.zone.ZoneRules;

public class ZoneOffsetTransitionRule_1 {
    public static void main(String[] args) {
        ZoneRules rules = ZoneRules.of();
        ZoneOffsetTransitionRule rule = rules.getTransitionRules().get(0);
        ZoneOffsetTransition transition = rule.createTransition(2021);
        System.out.println("Transition: " + transition);
    }
}
