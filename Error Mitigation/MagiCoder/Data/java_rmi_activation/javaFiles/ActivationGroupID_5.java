import java.rmi.activation.ActivationGroupID;

public class ActivationGroupID_5 {
    public static void main(String[] args) {
        ActivationGroupID groupID = new ActivationGroupID();
        int hashCode = groupID.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
