import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.io.IOException;

public class MulticastSocket_3 {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("224.0.0.1");
            MulticastSocket socket = new MulticastSocket(4446);
            socket.joinGroup(group);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
