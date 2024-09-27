import java.time.zone.ZoneOffsetTransitionRule;
import java.time.Month;

public class ZoneOffsetTransitionRule_3 {
    public static void main(String[] args) {
        ZoneOffsetTransitionRule rule = ZoneOffsetTransitionRule.of(Month.JANUARY, 1, Month.FEBRUARY, 1, null, null, null, null, null);
        Month month = rule.getMonth();
        System.out.println("Transition occurs in: " + month);
    }
}
