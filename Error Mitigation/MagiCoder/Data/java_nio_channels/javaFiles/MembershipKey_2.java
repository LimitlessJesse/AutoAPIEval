import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.MembershipKey;
import java.nio.channels.NetworkChannel;
import java.nio.channels.SocketChannel;

public class MembershipKey_2 {
    public static void main(String[] args) throws IOException {
        // Create a socket channel
        SocketChannel socketChannel = SocketChannel.open();

        // Get the network channel
        NetworkChannel networkChannel = socketChannel.socket().getChannel();

        // Bind the network channel to a local address
        networkChannel.bind(new InetSocketAddress(8080));

        // Join a multicast group
        MembershipKey membershipKey = networkChannel.join(new InetSocketAddress("224.0.0.1", 8080));

        // Check if the membership key is valid
        boolean isValid = membershipKey.isValid();

        System.out.println("Membership key is valid: " + isValid);

        // Drop the membership
        membershipKey.drop();

        // Check if the membership key is valid after dropping
        isValid = membershipKey.isValid();

        System.out.println("Membership key is valid after dropping: " + isValid);

        // Close the network channel
        networkChannel.close();
    }
}
