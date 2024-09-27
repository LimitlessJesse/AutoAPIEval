import java.net.ServerSocket;
import java.net.SocketAddress;
import java.io.IOException;

public class ServerSocket_9 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(0);
            SocketAddress socketAddress = serverSocket.getLocalSocketAddress();
            System.out.println(socketAddress);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
