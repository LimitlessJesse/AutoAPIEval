import java.time.zone.ZoneOffsetTransition;

public class ZoneOffsetTransition_3 {
    public static void main(String[] args) {
        ZoneOffsetTransition transition = ZoneOffsetTransition.of(/*parameters*/);
        boolean isGap = transition.isGap();
        System.out.println("Is this transition a gap? " + isGap);
    }
}
