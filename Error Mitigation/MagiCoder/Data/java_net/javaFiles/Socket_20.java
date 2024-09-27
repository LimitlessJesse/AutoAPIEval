import java.net.Socket;
import java.net.SocketException;

public class Socket_20 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            boolean tcpNoDelay = socket.getTcpNoDelay();
            System.out.println("TCP_NODELAY is " + (tcpNoDelay? "enabled" : "disabled"));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
