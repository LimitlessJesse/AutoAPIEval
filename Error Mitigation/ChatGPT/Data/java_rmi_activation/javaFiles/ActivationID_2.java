import java.rmi.activation.ActivationID;

public class ActivationID_2 {
    public static void main(String[] args) {
        ActivationID id1 = new ActivationID(12345);
        ActivationID id2 = new ActivationID(12345);
        
        boolean result = id1.equals(id2);
        System.out.println("Are the Activation IDs equal? " + result);
    }
}
