import java.rmi.activation.ActivationDesc;
import java.rmi.activation.ActivationGroupID;

public class ActivationDesc_1 {
    public static void main(String[] args) {
        ActivationDesc activationDesc = new ActivationDesc();
        ActivationGroupID groupID = activationDesc.getGroupID();
        System.out.println("Activation Group ID: " + groupID);
    }
}
