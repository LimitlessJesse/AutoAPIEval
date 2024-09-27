import java.rmi.activation.ActivationID;

public class ActivationID_5 {
    public static void main(String[] args) {
        ActivationID activationID = new ActivationID(12345);
        int hashCode = activationID.hashCode();
        System.out.println("HashCode of Activation ID: " + hashCode);
    }
}
