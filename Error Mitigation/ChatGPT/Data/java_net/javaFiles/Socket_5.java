import java.net.Socket;
import java.io.IOException;

public class Socket_5 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.close();
            System.out.println("Socket closed successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
