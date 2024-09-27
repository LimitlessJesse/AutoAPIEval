import org.omg.PortableServer.ThreadPolicyValue;

public class ThreadPolicyValue_4 {
    public static void main(String[] args) {
        int value = 1;
        ThreadPolicyValue policyValue = ThreadPolicyValue.from_int(value);
        System.out.println("Thread Policy Value: " + policyValue.value());
    }
}
