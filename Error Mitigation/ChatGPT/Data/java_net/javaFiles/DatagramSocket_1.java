import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class DatagramSocket_1 {
    public static void main(String[] args) {
        DatagramSocket socket = new DatagramSocket();
        SocketAddress address = new InetSocketAddress("localhost", 8080);
        
        try {
            socket.bind(address);
            System.out.println("DatagramSocket bound successfully to " + address);
        } catch (SocketException e) {
            System.err.println("Error binding DatagramSocket: " + e.getMessage());
        }
    }
}
