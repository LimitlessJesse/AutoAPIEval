import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramSocket_29 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            int port = 8080;
            DatagramSocket socket = new DatagramSocket();
            socket.connect(address, port);
            System.out.println("Connected to " + socket.getInetAddress() + " on port " + socket.getPort());
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
