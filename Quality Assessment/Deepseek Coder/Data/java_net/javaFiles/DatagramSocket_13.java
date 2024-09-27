import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_13 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setBroadcast(true);
            System.out.println("Broadcast mode is " + (socket.getBroadcast()? "on" : "off"));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
