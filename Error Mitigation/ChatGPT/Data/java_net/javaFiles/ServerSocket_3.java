import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocket_3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.close();
            System.out.println("Server socket closed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
