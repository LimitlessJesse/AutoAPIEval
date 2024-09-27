import java.rmi.activation.ActivationID;

public class ActivationID_3 {
    public static void main(String[] args) {
        ActivationID activationID = new ActivationID();
        int hashCode = activationID.hashCode();
        System.out.println("Hash code for activation id: " + hashCode);
    }
}
