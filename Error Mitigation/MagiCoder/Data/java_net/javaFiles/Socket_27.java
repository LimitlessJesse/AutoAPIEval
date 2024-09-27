import java.net.Socket;
import java.net.SocketException;

public class Socket_27 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setSoLinger(true, 5);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
