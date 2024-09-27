import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_8 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int localPort = socket.getLocalPort();
            System.out.println("Local port: " + localPort);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
