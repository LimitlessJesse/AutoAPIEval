import javax.net.SocketFactory;
import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;

public class SocketFactory_3 {
    public static void main(String[] args) {
        SocketFactory socketFactory = SocketFactory.getDefault();
        try {
            InetAddress host = InetAddress.getByName("example.com");
            int port = 80;
            Socket socket = socketFactory.createSocket(host, port);
            System.out.println("Socket created and connected to " + host + " on port " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
