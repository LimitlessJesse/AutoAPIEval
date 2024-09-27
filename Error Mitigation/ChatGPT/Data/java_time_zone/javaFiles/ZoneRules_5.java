import java.time.LocalDateTime;
import java.time.ZoneOffsetTransition;
import java.time.zone.ZoneRules;

public class ZoneRules_5 {
    public static void main(String[] args) {
        // Assuming 'rules' is an instance of ZoneRules
        LocalDateTime localDT = LocalDateTime.now();
        ZoneOffsetTransition trans = rules.getTransition(localDT);
        
        if (trans == null) {
            // Gap or Overlap: determine what to do from transition
            System.out.println("Gap or Overlap occurred at the specified local date-time");
        } else {
            // Normal case: only one valid offset
            ZoneOffset zoneOffset = trans.getOffsetBefore();
            System.out.println("Valid offset for the specified local date-time: " + zoneOffset);
        }
    }
}
