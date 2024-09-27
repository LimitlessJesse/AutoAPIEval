import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_19 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setBroadcast(true);
            System.out.println("Broadcast enabled successfully.");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
