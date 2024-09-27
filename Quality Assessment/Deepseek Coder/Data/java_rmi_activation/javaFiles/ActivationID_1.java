import java.rmi.activation.ActivationID;

public class ActivationID_1 {
    public static void main(String[] args) {
        try {
            ActivationID id1 = ActivationID.generate();
            ActivationID id2 = ActivationID.generate();

            boolean isEqual = id1.equals(id2);

            System.out.println("Are the ActivationIDs equal? " + isEqual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
