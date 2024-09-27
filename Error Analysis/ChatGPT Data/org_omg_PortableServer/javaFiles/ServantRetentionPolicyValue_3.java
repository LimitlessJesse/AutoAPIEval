import org.omg.PortableServer.ServantRetentionPolicyValue;

public class ServantRetentionPolicyValue_3 {
    public static void main(String[] args) {
        int i = 1;
        ServantRetentionPolicyValue value = ServantRetentionPolicyValue.from_int(i);
        System.out.println("ServantRetentionPolicyValue: " + value.value());
    }
}
