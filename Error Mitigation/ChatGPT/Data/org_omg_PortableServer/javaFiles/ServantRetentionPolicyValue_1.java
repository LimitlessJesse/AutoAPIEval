import org.omg.PortableServer.ServantRetentionPolicyValue;

public class ServantRetentionPolicyValue_1 {
    public static void main(String[] args) {
        ServantRetentionPolicyValue value = new ServantRetentionPolicyValue();
        int result = value.value();
        System.out.println("Value: " + result);
    }
}
