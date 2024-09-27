import java.net.Socket;
import java.net.SocketException;

public class Socket_21 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.setReuseAddress(true);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
