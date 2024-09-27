import javax.accessibility.AccessibleState;
import javax.accessibility.AccessibleStateSet;

public class AccessibleStateSet_1 {
    public static void main(String[] args) {
        AccessibleStateSet stateSet = new AccessibleStateSet();
        AccessibleState state = AccessibleState.ACTIVE;
        
        boolean isStateInSet = stateSet.contains(state);
        System.out.println("Is state in set: " + isStateInSet);
    }
}
