import java.rmi.activation.ActivationGroupID;

public class ActivationGroupID_3 {
    public static void main(String[] args) {
        ActivationGroupID id1 = new ActivationGroupID();
        ActivationGroupID id2 = new ActivationGroupID();
        
        boolean result = id1.equals(id2);
        System.out.println("Are the ActivationGroupIDs equal? " + result);
    }
}
