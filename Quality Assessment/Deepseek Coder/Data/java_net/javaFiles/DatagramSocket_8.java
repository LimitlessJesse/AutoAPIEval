import java.net.DatagramSocket;
import java.io.IOException;

public class DatagramSocket_8 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int port = socket.getLocalPort();
            System.out.println("Local port: " + port);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
