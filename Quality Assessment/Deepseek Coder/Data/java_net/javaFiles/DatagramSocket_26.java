import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.SocketAddress;

public class DatagramSocket_26 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            System.out.println("Local Socket Address: " + localSocketAddress);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
