import org.omg.PortableServer.*;

public class ServantRetentionPolicyValue_1 {
    public static void main(String[] args) {
        ServantRetentionPolicyValue policyValue = ServantRetentionPolicyValue.PERSISTENT;
        int value = policyValue.value();
        System.out.println("Value of the policy: " + value);
    }
}
