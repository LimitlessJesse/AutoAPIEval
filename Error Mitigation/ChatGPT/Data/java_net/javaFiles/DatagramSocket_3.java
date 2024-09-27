import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class DatagramSocket_3 {
    public static void main(String[] args) {
        DatagramSocket socket = new DatagramSocket();
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8080);
        
        try {
            socket.connect(address);
            System.out.println("Socket connected to: " + address);
        } catch (SocketException e) {
            System.err.println("SocketException: " + e.getMessage());
        }
    }
}
