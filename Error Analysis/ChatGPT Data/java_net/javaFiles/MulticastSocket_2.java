import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.NetworkInterface;
import java.net.InetAddress;
import java.io.IOException;

public class MulticastSocket_2 {
    public static void main(String[] args) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            InetAddress group = InetAddress.getByName("224.0.0.1");
            NetworkInterface netIf = NetworkInterface.getByName("eth0");
            SocketAddress mcastaddr = new InetSocketAddress(group, 1234);
            
            multicastSocket.leaveGroup(mcastaddr, netIf);
            multicastSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
