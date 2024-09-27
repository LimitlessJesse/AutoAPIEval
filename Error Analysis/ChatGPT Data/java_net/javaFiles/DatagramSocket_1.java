import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.InetSocketAddress;

public class DatagramSocket_1 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetSocketAddress bindpoint = new InetSocketAddress("localhost", 8080);
            socket.bind(bindpoint);
            System.out.println("Socket bound to address: " + bindpoint);
        } catch (SocketException e) {
            System.out.println("Socket bind failed: " + e.getMessage());
        }
    }
}
