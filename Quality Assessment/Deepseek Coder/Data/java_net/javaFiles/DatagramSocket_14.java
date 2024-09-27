import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_14 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setBroadcast(true);
            boolean broadcast = socket.getBroadcast();
            System.out.println("Broadcast mode: " + broadcast);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
