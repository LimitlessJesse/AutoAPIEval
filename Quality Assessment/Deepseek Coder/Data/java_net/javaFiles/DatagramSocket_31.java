import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_31 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
