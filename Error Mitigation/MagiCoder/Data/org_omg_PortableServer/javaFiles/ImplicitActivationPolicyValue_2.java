import org.omg.PortableServer.ImplicitActivationPolicyValue;

public class ImplicitActivationPolicyValue_2 {
    public static void main(String[] args) {
        ImplicitActivationPolicyValue policy = new ImplicitActivationPolicyValue();
        int value = policy.value();
        System.out.println("The value is: " + value);
    }
}
