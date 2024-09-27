import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_12 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            boolean reuseAddress = socket.getReuseAddress();
            System.out.println("Reuse Address: " + reuseAddress);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
