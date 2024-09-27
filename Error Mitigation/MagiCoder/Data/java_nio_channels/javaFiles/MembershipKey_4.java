import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.MembershipKey;
import java.nio.channels.MulticastChannel;

public class MembershipKey_4 {
    public static void main(String[] args) throws IOException {
        // Create a MulticastChannel
        MulticastChannel channel = MulticastChannel.open();
        channel.join(new InetSocketAddress("224.0.0.1", 5007), null);

        // Get the MembershipKey
        MembershipKey key = channel.getMembershipKey();

        // Get the channel from the MembershipKey
        MulticastChannel channelFromKey = key.channel();

        // Print the channel
        System.out.println(channelFromKey);

        // Close the channel
        channel.close();
    }
}
