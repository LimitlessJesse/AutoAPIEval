import org.omg.PortableServer.ImplicitActivationPolicyValue;

public class ImplicitActivationPolicyValue_2 {
    public static void main(String[] args) {
        int value = 1; // Example value
        ImplicitActivationPolicyValue policyValue = ImplicitActivationPolicyValue.from_int(value);
        System.out.println("Policy Value: " + policyValue);
    }
}
