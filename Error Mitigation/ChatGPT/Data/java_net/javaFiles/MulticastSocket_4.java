import java.io.IOException;
import java.net.MulticastSocket;

public class MulticastSocket_4 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket();
            socket.setTimeToLive(10);
            System.out.println("Time-to-live set successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
