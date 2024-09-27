import java.net.MulticastSocket;
import java.io.IOException;

public class MulticastSocket_4 {
    public static void main(String[] args) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            multicastSocket.setLoopbackMode(false);
            System.out.println("Loopback mode disabled: " + !multicastSocket.getLoopbackMode());
            multicastSocket.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
