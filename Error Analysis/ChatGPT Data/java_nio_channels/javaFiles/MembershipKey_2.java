import java.nio.channels.MembershipKey;
import java.nio.channels.MulticastChannel;

public class MembershipKey_2 {
    public static void main(String[] args) {
        // Assuming you have a MulticastChannel instance called multicastChannel

        MembershipKey key = multicastChannel.join(someAddress, someNetworkInterface);

        // Perform some operations

        key.drop();
    }
}
