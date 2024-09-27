import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_7 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int port = socket.getPort();
            System.out.println("Port number: " + port);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
