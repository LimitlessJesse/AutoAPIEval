import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_16 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int timeout = socket.getSoTimeout();
            System.out.println("SO_TIMEOUT: " + timeout);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
