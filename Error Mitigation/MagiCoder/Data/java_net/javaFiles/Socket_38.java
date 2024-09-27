import java.net.Socket;
import java.net.SocketException;

public class Socket_38 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            int receiveBufferSize = socket.getReceiveBufferSize();
            System.out.println("Receive buffer size: " + receiveBufferSize);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
