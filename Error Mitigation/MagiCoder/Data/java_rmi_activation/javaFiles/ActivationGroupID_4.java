import java.rmi.activation.ActivationGroupID;

public class ActivationGroupID_4 {
    public static void main(String[] args) {
        ActivationGroupID id1 = new ActivationGroupID("group1", "system1");
        ActivationGroupID id2 = new ActivationGroupID("group1", "system1");
        ActivationGroupID id3 = new ActivationGroupID("group2", "system1");

        System.out.println(id1.equals(id2)); // true
        System.out.println(id1.equals(id3)); // false
    }
}
