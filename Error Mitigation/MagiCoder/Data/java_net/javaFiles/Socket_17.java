import java.net.Socket;
import java.net.SocketException;

public class Socket_17 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setSoTimeout(5000); // Set timeout to 5 seconds
            // Add your code here that uses the socket
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
