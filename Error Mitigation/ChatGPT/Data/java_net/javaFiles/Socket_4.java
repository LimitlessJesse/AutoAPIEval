import java.net.Socket;
import java.net.SocketException;

public class Socket_4 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.setSoTimeout(5000); // Set timeout to 5 seconds
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
