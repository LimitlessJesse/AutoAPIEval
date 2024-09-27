import java.time.ZoneOffset;
import java.time.zone.ZoneOffsetTransition;

public class ZoneOffsetTransition_2 {
    public static void main(String[] args) {
        ZoneOffsetTransition transition = ZoneOffsetTransition.of(ZoneOffset.ofHours(1), ZoneOffset.ofHours(2));
        ZoneOffset offsetAfter = transition.getOffsetAfter();
        System.out.println("Offset after transition: " + offsetAfter);
    }
}
