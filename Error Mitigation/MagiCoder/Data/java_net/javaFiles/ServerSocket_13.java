import java.net.ServerSocket;
import java.net.SocketException;

public class ServerSocket_13 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.setReceiveBufferSize(1024);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
