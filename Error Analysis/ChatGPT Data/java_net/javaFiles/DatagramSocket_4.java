import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_4 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            System.out.println("Socket created");
            
            socket.disconnect();
            System.out.println("Socket disconnected");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
