import java.rmi.activation.ActivationGroupID;
import java.util.Arrays;

public class ActivationGroupID_2 {
    public static void main(String[] args) {
        ActivationGroupID id1 = new ActivationGroupID();
        ActivationGroupID id2 = new ActivationGroupID();
        
        System.out.println("Are the two ActivationGroupIDs equal? " + id1.equals(id2));
    }
}
