import java.net.ServerSocket;
import java.net.SocketException;

public class ServerSocket_14 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.setReuseAddress(true);
            System.out.println("ServerSocket is created and reuse address is set to true.");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
