import java.net.Socket;
import java.net.SocketException;

public class Socket_70 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            int sendBufferSize = socket.getSendBufferSize();
            System.out.println("Send buffer size: " + sendBufferSize);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
