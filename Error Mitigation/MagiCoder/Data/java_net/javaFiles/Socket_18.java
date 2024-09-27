import java.net.Socket;
import java.net.SocketException;

public class Socket_18 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            int timeout = socket.getSoTimeout();
            System.out.println("SO_TIMEOUT: " + timeout);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
