import java.net.DatagramSocket;
import java.io.IOException;

public class DatagramSocket_2 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.close();
            System.out.println("Socket closed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
