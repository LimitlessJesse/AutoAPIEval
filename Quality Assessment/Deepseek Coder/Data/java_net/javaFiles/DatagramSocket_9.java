import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_9 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setSoTimeout(5000); // Set timeout to 5 seconds
            System.out.println("Timeout set to: " + socket.getSoTimeout() + " milliseconds");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
