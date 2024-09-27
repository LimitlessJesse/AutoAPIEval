import org.omg.PortableServer.RequestProcessingPolicyValue;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

public class RequestProcessingPolicyValue_1 {
    public static void main(String[] args) {
        RequestProcessingPolicyValue policy = REQUEST_PROCESSING_POLICY_ID.DISCARD;
        int value = policy.value();
        System.out.println("The integer value of the policy is: " + value);
    }
}
