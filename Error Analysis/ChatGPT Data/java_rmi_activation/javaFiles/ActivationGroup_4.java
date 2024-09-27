import java.rmi.activation.ActivationGroup;
import java.rmi.activation.ActivationID;

public class ActivationGroup_4 {
    public static void main(String[] args) {
        ActivationGroup activationGroup = new ActivationGroup();
        ActivationID id = new ActivationID();
        
        // Deactivate the object with the given ActivationID
        boolean result = activationGroup.inactiveObject(id);
        
        System.out.println("Object inactive: " + result);
    }
}
