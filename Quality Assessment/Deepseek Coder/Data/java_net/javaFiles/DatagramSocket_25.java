import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class DatagramSocket_25 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetSocketAddress address = new InetSocketAddress("localhost", 9999);
            socket.bind(address);
            System.out.println("Socket is bound to address: " + socket.getLocalSocketAddress());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
