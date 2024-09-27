import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class DatagramSocket_30 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetSocketAddress address = new InetSocketAddress("localhost", 8080);
            socket.connect(address);
            System.out.println("Connected to " + socket.getRemoteSocketAddress());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
