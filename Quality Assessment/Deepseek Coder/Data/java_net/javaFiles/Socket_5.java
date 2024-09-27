import java.net.Socket;
import java.io.IOException;

public class Socket_5 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("example.com", 80);
            // Perform some operations with the socket
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket!= null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
