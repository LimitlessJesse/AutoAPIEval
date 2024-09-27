import java.net.Socket;
import java.net.SocketException;

public class Socket_31 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.setReceiveBufferSize(1024);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
