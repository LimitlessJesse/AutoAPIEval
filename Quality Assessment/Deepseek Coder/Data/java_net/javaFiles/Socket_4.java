import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Socket_4 {
    public static void main(String[] args) {
        try {
            // Create a new socket
            Socket socket = new Socket("example.com", 80);

            // Get the output stream from the socket
            OutputStream outputStream = socket.getOutputStream();

            // Create a string to send
            String request = "GET / HTTP/1.1\r\nHost: example.com\r\n\r\n";

            // Convert the string to bytes and send it
            outputStream.write(request.getBytes());

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
