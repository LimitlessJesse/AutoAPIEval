import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket_2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server socket created. Waiting for connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Connection accepted from: " + socket.getInetAddress());

            serverSocket.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
