import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramSocket_6 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = socket.getInetAddress();
            System.out.println("The address to which this socket is connected: " + address);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
