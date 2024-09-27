import java.time.ZoneOffset;
import java.time.zone.ZoneOffsetTransition;

public class ZoneOffsetTransition_1 {
    public static void main(String[] args) {
        ZoneOffsetTransition transition = // create ZoneOffsetTransition object
        ZoneOffset offsetBefore = transition.getOffsetBefore();
        System.out.println("Offset before transition: " + offsetBefore);
    }
}
