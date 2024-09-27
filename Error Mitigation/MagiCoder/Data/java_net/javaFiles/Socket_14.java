import java.net.Socket;
import java.io.IOException;

public class Socket_14 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            boolean isConnected = socket.isConnected();
            System.out.println("Is the socket connected? " + isConnected);
            socket.close();
            isConnected = socket.isConnected();
            System.out.println("Is the socket connected after closing? " + isConnected);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
