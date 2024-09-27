import java.net.Socket;
import java.io.OutputStream;
import java.io.IOException;

public class Socket_4 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            OutputStream outputStream = socket.getOutputStream();
            // Now you can write to the outputStream
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
