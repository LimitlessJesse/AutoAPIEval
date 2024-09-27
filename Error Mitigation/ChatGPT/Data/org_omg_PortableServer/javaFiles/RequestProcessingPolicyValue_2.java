import org.omg.PortableServer.RequestProcessingPolicyValue;

public class RequestProcessingPolicyValue_2 {
    public static void main(String[] args) {
        int value = 1; // Example value
        RequestProcessingPolicyValue policyValue = RequestProcessingPolicyValue.from_int(value);
        System.out.println("Policy value: " + policyValue);
    }
}
