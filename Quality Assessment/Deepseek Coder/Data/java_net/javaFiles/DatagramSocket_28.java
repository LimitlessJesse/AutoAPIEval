import java.net.DatagramSocket;
import java.io.IOException;

public class DatagramSocket_28 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int port = socket.getPort();
            System.out.println("Port number: " + port);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
