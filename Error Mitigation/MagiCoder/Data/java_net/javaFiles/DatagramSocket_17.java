import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_17 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setReuseAddress(true);
            System.out.println("SO_REUSEADDR option is enabled.");
        } catch (SocketException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
