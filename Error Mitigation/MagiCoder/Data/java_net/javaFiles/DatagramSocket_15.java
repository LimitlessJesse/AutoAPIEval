import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_15 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setSoTimeout(1000); // Set timeout to 1 second
            //...
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
