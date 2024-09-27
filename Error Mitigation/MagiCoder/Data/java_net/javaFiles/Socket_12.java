import java.net.Socket;
import java.io.IOException;

public class Socket_12 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            int localPort = socket.getLocalPort();
            System.out.println("Local port: " + localPort);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
