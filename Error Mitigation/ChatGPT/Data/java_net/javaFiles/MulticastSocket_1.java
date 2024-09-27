import java.io.IOException;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;

public class MulticastSocket_1 {
    public static void main(String[] args) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            SocketAddress mcastaddr = null; // specify the multicast address
            NetworkInterface netIf = NetworkInterface.getByName("eth0"); // specify the network interface
            multicastSocket.joinGroup(mcastaddr, netIf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
