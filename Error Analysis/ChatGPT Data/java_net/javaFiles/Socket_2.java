import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Socket_2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            OutputStream outputStream = socket.getOutputStream();
            
            // Write data to the output stream
            String data = "Hello, Server!";
            outputStream.write(data.getBytes());
            
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
