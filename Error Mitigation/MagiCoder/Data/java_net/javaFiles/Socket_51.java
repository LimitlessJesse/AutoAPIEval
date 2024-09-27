import java.net.Socket;
import java.net.SocketException;

public class Socket_51 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setSendBufferSize(1024);
            System.out.println("Send buffer size set successfully!");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
