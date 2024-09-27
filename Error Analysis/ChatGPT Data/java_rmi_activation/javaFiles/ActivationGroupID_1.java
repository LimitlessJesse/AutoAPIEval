import java.rmi.activation.ActivationGroupID;

public class ActivationGroupID_1 {
    public static void main(String[] args) {
        ActivationGroupID id = new ActivationGroupID();
        int hashCode = id.hashCode();
        System.out.println("Hash Code: " + hashCode);
    }
}
