import java.rmi.activation.ActivationGroupID;

public class ActivationGroupID_4 {
    public static void main(String[] args) {
        ActivationGroupID groupID = new ActivationGroupID();
        int hashCode = groupID.hashCode();
        System.out.println("Hash code for the group's identifier: " + hashCode);
    }
}
