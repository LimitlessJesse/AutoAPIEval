import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Socket_1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("example.com", 80);
            InputStream inputStream = socket.getInputStream();
            // Use the inputStream for reading data from the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
