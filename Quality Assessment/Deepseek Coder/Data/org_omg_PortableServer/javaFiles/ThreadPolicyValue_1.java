import org.omg.PortableServer.ThreadPolicyValue;
import org.omg.PortableServer.THRDSVC_ID_POLICY_ID;

public class ThreadPolicyValue_1 {
    public static void main(String[] args) {
        ThreadPolicyValue policyValue = THRDSVC_ID_POLICY_ID.HIGH_PRIORITY;
        int value = policyValue.value();
        System.out.println("The value of the policy is: " + value);
    }
}
