import java.net.DatagramSocketImpl;
import java.net.InetAddress;

public class DatagramSocketImpl_2 {
    public static void main(String[] args) {
        // Example usage of bind(int port, InetAddress laddr)
        try {
            DatagramSocketImpl socket = new DatagramSocketImpl();
            int port = 8080; // Port number
            InetAddress address = InetAddress.getLocalHost(); // Local address
            socket.bind(port, address);
            System.out.println("Socket bound successfully to port " + port + " and address " + address);
        } catch (Exception e) {
            System.out.println("Error binding socket: " + e.getMessage());
        }
    }
}
