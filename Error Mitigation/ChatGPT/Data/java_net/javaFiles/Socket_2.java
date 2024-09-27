import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Socket_2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("example.com", 80);
            InputStream inputStream = socket.getInputStream();
            // Use the inputStream to read data from the socket
            inputStream.close(); // Closing the InputStream will also close the associated socket
            socket.close(); // Close the socket when done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
