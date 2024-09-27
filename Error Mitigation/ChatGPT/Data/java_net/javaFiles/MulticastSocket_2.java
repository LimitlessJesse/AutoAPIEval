import java.io.IOException;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;

public class MulticastSocket_2 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket();
            SocketAddress mcastaddr = null; // specify the multicast address
            NetworkInterface netIf = null; // specify the network interface
            socket.leaveGroup(mcastaddr, netIf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
