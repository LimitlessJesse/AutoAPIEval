import javax.accessibility.AccessibleState;
import javax.accessibility.AccessibleStateSet;

public class AccessibleStateSet_5 {
    public static void main(String[] args) {
        AccessibleStateSet stateSet = new AccessibleStateSet();
        AccessibleState[] states = stateSet.toArray();
        for (AccessibleState state : states) {
            System.out.println(state);
        }
    }
}
