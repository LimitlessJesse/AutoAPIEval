import org.omg.PortableServer.ServantRetentionPolicyValue;

public class ServantRetentionPolicyValue_1 {
    public static void main(String[] args) {
        ServantRetentionPolicyValue value = new ServantRetentionPolicyValue();
        int intValue = value.value();
        System.out.println("Integer value: " + intValue);
    }
}
