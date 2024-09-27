import java.net.ServerSocket;
import java.net.SocketException;

public class ServerSocket_15 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.setSoTimeout(5000);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
