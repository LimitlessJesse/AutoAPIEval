import java.net.ServerSocket;
import java.net.InetAddress;
import java.io.IOException;

public class ServerSocket_7 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(0);
            InetAddress inetAddress = serverSocket.getInetAddress();
            System.out.println("Local Address: " + inetAddress);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
