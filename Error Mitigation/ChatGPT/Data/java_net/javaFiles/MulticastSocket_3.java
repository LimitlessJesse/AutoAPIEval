import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MulticastSocket_3 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket();
            InetAddress inf = InetAddress.getByName("224.0.0.1");
            socket.setInterface(inf);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
