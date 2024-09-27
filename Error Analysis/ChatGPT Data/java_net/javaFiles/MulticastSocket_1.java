import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;

public class MulticastSocket_1 {
    public static void main(String[] args) {
        try {
            SocketAddress mcastaddr = InetAddress.getByName("your_multicast_address_here");
            NetworkInterface netIf = NetworkInterface.getByInetAddress(InetAddress.getByName("your_network_interface_address_here"));
            
            MulticastSocket multicastSocket = new MulticastSocket();
            multicastSocket.joinGroup(mcastaddr, netIf);
            System.out.println("Joined multicast group successfully");
            
            // Do other operations with the multicast socket
            
            multicastSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
