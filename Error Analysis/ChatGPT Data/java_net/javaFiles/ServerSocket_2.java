import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocket_2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            // ServerSocket operations
            serverSocket.close();
            System.out.println("ServerSocket closed");
        } catch (IOException e) {
            System.out.println("Exception caught when trying to close ServerSocket: " + e.getMessage());
        }
    }
}
