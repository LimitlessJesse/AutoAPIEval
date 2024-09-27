import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_11 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            socket.setReuseAddress(true);
            System.out.println("Reuse address is: " + socket.getReuseAddress());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
