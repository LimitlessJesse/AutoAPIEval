import org.omg.PortableServer.LifespanPolicyValue;

public class LifespanPolicyValue_2 {
    public static void main(String[] args) {
        int i = 0; // example input value
        LifespanPolicyValue lifespanPolicyValue = LifespanPolicyValue.from_int(i);
        System.out.println("LifespanPolicyValue: " + lifespanPolicyValue.value());
    }
}
