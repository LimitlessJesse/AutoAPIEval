import java.time.zone.ZoneOffsetTransition;

public class ZoneOffsetTransition_5 {
    public static void main(String[] args) {
        // Create a ZoneOffsetTransition object
        ZoneOffsetTransition transition = ZoneOffsetTransition.of(...);
        
        // Check if the offset is valid
        boolean isValid = transition.isValidOffset(ZoneOffset.ofHours(2));
        System.out.println("Is valid offset: " + isValid);
    }
}
