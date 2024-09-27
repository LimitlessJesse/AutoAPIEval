import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_5 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            // Use the socket...
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
