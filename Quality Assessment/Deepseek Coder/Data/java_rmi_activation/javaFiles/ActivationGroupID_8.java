import java.rmi.activation.ActivationGroupID;
import java.rmi.activation.ActivationGroup;

public class ActivationGroupID_8 {
    public static void main(String[] args) {
        try {
            ActivationGroupID agid1 = ActivationGroupID.find(ActivationGroup.find("group1"));
            ActivationGroupID agid2 = ActivationGroupID.find(ActivationGroup.find("group2"));

            boolean isEqual = agid1.equals(agid2);

            System.out.println("Are the two ActivationGroupIDs equal? " + isEqual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
