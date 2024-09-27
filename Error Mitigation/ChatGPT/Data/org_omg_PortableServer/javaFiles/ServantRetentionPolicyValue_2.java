import org.omg.PortableServer.ServantRetentionPolicyValue;

public class ServantRetentionPolicyValue_2 {
    public static void main(String[] args) {
        int value = 1; // Example value
        ServantRetentionPolicyValue servantRetentionPolicyValue = ServantRetentionPolicyValue.from_int(value);
        System.out.println("ServantRetentionPolicyValue: " + servantRetentionPolicyValue);
    }
}
