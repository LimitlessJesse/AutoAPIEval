import org.omg.PortableServer.ImplicitActivationPolicyValue;

public class ImplicitActivationPolicyValue_3 {
    public static void main(String[] args) {
        ImplicitActivationPolicyValue policyValue = ImplicitActivationPolicyValue.IMPLICIT_ACTIVATION;
        int value = policyValue.value();
        System.out.println("Value of ImplicitActivationPolicyValue: " + value);
    }
}
