import java.net.*;
import java.io.*;

public class Socket_34 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.shutdownOutput();
            // Now you can't write to the socket's output stream
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(1); // This will throw an IOException
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
