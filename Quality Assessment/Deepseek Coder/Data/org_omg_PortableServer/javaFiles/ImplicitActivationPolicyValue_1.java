import org.omg.PortableServer.*;

public class ImplicitActivationPolicyValue_1 {
    public static void main(String[] args) {
        ImplicitActivationPolicyValue policyValue = ImplicitActivationPolicyValue.NO_IMPLICIT_ACTIVATION;
        int value = policyValue.value();
        System.out.println("The value of the policy is: " + value);
    }
}
