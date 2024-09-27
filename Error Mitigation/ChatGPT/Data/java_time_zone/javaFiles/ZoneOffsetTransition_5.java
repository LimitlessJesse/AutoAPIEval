import java.time.Instant;
import java.time.zone.ZoneOffsetTransition;

public class ZoneOffsetTransition_5 {
    public static void main(String[] args) {
        ZoneOffsetTransition transition = ZoneOffsetTransition.of(Instant.now(), ZoneOffsetTransition.of(Instant.now(), Instant.now()));
        Instant transitionInstant = transition.getInstant();
        System.out.println("Transition Instant: " + transitionInstant);
    }
}
