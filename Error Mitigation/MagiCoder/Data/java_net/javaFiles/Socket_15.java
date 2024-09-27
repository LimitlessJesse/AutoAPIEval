import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;

public class Socket_15 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = new Socket("localhost", 8080);

            System.out.println("Socket is bound: " + socket.isBound());

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
