import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramSocket_7 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = socket.getLocalAddress();
            System.out.println("Local IP Address: " + address.getHostAddress());
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
