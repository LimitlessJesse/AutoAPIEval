import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MulticastSocket_5 {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("224.0.0.1");
            MulticastSocket socket = new MulticastSocket(4446);
            socket.joinGroup(group);
            socket.setTimeToLive(1);
            socket.leaveGroup(group);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
