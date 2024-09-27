import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_14 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            System.out.println(socket.isConnected());
            socket.close();
            System.out.println(socket.isConnected());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
