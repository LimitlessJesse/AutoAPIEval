import java.net.InetAddress;
import java.nio.channels.MembershipKey;

public class MembershipKey_5 {
    public static void main(String[] args) {
        MembershipKey membershipKey = null; // Initialize your MembershipKey object
        
        InetAddress sourceAddress = membershipKey.sourceAddress();
        if (sourceAddress != null) {
            System.out.println("Source Address: " + sourceAddress.getHostAddress());
        } else {
            System.out.println("Membership is not source-specific");
        }
    }
}
