import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class ServerSocket_4 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
