import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_20 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            boolean isBroadcastEnabled = socket.getBroadcast();
            System.out.println("SO_BROADCAST is enabled: " + isBroadcastEnabled);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
