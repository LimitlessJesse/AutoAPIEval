import org.omg.PortableServer.ThreadPolicyValue;

public class ThreadPolicyValue_1 {
    public static void main(String[] args) {
        ThreadPolicyValue policyValue = ThreadPolicyValue.value(1);
        System.out.println("Thread Policy Value: " + policyValue.value());
    }
}
