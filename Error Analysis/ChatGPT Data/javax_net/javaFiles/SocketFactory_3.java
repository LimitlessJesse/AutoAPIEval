import javax.net.SocketFactory;
import java.net.InetAddress;
import java.net.Socket;

public class SocketFactory_3 {
    public static void main(String[] args) {
        try {
            SocketFactory socketFactory = SocketFactory.getDefault();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 8080;
            Socket socket = socketFactory.createSocket(address, port);

            System.out.println("Socket created successfully: " + socket);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
