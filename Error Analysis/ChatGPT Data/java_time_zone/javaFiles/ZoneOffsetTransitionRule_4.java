import java.time.DayOfWeek;
import java.time.zone.ZoneOffsetTransitionRule;

public class ZoneOffsetTransitionRule_4 {
    public static void main(String[] args) {
        ZoneOffsetTransitionRule rule = ZoneOffsetTransitionRule.of(DayOfWeek.MONDAY, 1, 2);
        DayOfWeek dayOfWeek = rule.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);
    }
}
