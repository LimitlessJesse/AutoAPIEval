import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Socket_3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("example.com", 80);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
