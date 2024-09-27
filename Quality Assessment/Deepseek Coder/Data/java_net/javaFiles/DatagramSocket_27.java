import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.IOException;

public class DatagramSocket_27 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = socket.getInetAddress();
            System.out.println("Local Address: " + address.getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
