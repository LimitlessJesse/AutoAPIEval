import org.omg.PortableServer.ImplicitActivationPolicyValue;

public class ImplicitActivationPolicyValue_3 {
    public static void main(String[] args) {
        int value = 1;
        ImplicitActivationPolicyValue policyValue = ImplicitActivationPolicyValue.from_int(value);
        System.out.println("Policy Value: " + policyValue.value());
    }
}
