import java.net.InetAddress;
import java.net.MulticastSocket;
import java.io.IOException;

public class MulticastSocket_4 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket();
            InetAddress group = InetAddress.getByName("224.0.0.1");
            socket.leaveGroup(group);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
