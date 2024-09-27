import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_6 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            // Your code here
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
