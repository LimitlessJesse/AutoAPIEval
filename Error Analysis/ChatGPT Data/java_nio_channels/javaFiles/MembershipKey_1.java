import java.net.InetAddress;
import java.nio.channels.MembershipKey;

public class MembershipKey_1 {
    public static void main(String[] args) {
        try {
            InetAddress multicastAddress = InetAddress.getByName("224.0.0.1");
            MembershipKey membershipKey = channel.join(multicastAddress, networkInterface);

            // Use the MembershipKey object as needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
