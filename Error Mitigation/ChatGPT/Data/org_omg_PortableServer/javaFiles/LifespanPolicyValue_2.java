import org.omg.PortableServer.LifespanPolicyValue;

public class LifespanPolicyValue_2 {
    public static void main(String[] args) {
        int value = 1; // Example value
        LifespanPolicyValue lifespanPolicyValue = LifespanPolicyValue.from_int(value);
        System.out.println("LifespanPolicyValue: " + lifespanPolicyValue);
    }
}
