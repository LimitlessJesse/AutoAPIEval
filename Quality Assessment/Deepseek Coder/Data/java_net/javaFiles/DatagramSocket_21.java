import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_21 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setTrafficClass(0x18);
            System.out.println("Traffic class set to: " + socket.getTrafficClass());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
