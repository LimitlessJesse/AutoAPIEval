import java.net.ServerSocket;
import java.net.SocketException;

public class ServerSocket_10 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            int receiveBufferSize = serverSocket.getReceiveBufferSize();
            System.out.println("Receive Buffer Size: " + receiveBufferSize);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
