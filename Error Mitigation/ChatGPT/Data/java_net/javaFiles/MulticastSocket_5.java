import java.net.MulticastSocket;
import java.net.SocketException;

public class MulticastSocket_5 {
    public static void main(String[] args) {
        MulticastSocket multicastSocket = new MulticastSocket();
        try {
            multicastSocket.setLoopbackMode(true);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
