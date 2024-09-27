import java.net.InetSocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.channels.MembershipKey;
import java.nio.channels.NetworkChannel;
import java.nio.channels.SocketChannel;

public class MembershipKey_3 {
    public static void main(String[] args) throws Exception {
        // Create a new socket channel
        SocketChannel socketChannel = SocketChannel.open(StandardProtocolFamily.INET);

        // Bind the socket channel to a local address
        socketChannel.bind(new InetSocketAddress(8080));

        // Get the network channel
        NetworkChannel networkChannel = socketChannel.socket().getChannel();

        // Join a multicast group
        InetSocketAddress group = new InetSocketAddress("224.0.0.1", 8080);
        MembershipKey membershipKey = networkChannel.join(group);

        // Drop the membership
        membershipKey.drop();

        // Close the socket channel
        socketChannel.close();
    }
}
