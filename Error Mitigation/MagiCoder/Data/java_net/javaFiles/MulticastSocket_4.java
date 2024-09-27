import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.io.IOException;

public class MulticastSocket_4 {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("224.0.0.1");
            MulticastSocket socket = new MulticastSocket();
            socket.leaveGroup(group);
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
