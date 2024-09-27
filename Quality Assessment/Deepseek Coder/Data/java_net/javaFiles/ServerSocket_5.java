import java.net.ServerSocket;
import java.io.IOException;
import java.net.InetAddress;

public class ServerSocket_5 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            InetAddress inetAddress = serverSocket.getInetAddress();
            System.out.println("IP Address: " + inetAddress.getHostAddress());
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
