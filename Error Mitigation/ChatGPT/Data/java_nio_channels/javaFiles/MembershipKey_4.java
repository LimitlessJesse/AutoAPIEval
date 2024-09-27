import java.net.NetworkInterface;
import java.nio.channels.MembershipKey;

public class MembershipKey_4 {
    public static void main(String[] args) {
        // Assume membershipKey is already initialized
        MembershipKey membershipKey = ...; // Initialize membershipKey
        
        NetworkInterface networkInterface = membershipKey.networkInterface();
        System.out.println("Network Interface: " + networkInterface);
    }
}
