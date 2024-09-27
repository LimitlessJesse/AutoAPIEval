import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_22 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int trafficClass = socket.getTrafficClass();
            System.out.println("Traffic class: " + trafficClass);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
