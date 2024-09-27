import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_5 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            int port = serverSocket.getLocalPort();
            System.out.println("Server is listening on port: " + port);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
