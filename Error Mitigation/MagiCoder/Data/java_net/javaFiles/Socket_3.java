import java.net.Socket;
import java.io.InputStream;
import java.io.IOException;

public class Socket_3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            InputStream inputStream = socket.getInputStream();
            // Now you can read from the inputStream
            // For example:
            int data = inputStream.read();
            System.out.println(data);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
