import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.MembershipKey;
import java.nio.channels.MulticastChannel;

public class MembershipKey_5 {
    public static void main(String[] args) throws UnknownHostException {
        MulticastChannel channel = MulticastChannel.open();
        InetAddress group = InetAddress.getByName("224.0.0.1");
        MembershipKey key = channel.join(group);

        InetAddress groupAddress = key.group();
        System.out.println("Group address: " + groupAddress);

        channel.close();
    }
}
