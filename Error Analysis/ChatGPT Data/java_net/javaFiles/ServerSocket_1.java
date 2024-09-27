import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket_1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server started and listening on port 8080");
            
            // Accept incoming connections
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            
            // Additional code to handle the accepted socket
            
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
