import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Socket_3 {
    public static void main(String[] args) {
        try {
            // Create a new socket
            Socket socket = new Socket("www.example.com", 80);

            // Get the input stream
            InputStream inputStream = socket.getInputStream();

            // Read data from the input stream
            int data = inputStream.read();

            // Print the data
            System.out.println((char) data);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
