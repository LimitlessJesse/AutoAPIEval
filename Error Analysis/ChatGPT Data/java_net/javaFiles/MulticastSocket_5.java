import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSocket_5 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket();
            InetAddress inf = InetAddress.getByName("224.0.0.1");
            socket.setInterface(inf);
            System.out.println("Interface set successfully to: " + inf);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
