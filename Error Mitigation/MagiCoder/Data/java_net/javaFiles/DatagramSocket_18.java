import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_18 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            boolean reuseAddress = socket.getReuseAddress();
            System.out.println("SO_REUSEADDR is " + (reuseAddress? "enabled" : "disabled"));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
