import java.net.InetAddress;
import java.net.ServerSocket;

public class ServerSocket_4 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            InetAddress address = serverSocket.getInetAddress();
            System.out.println("Local address of the server socket: " + address);
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
