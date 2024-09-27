import java.net.Socket;
import java.net.InetAddress;

public class Socket_10 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            InetAddress localAddress = socket.getLocalAddress();
            System.out.println("Local Address: " + localAddress);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
