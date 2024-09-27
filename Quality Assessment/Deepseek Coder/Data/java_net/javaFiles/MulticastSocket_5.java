import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MulticastSocket_5 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket();
            socket.setTimeToLive(1);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
