import java.net.Socket;
import java.io.IOException;

public class Socket_16 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            System.out.println("Socket is closed: " + socket.isClosed());
            socket.close();
            System.out.println("Socket is closed: " + socket.isClosed());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
