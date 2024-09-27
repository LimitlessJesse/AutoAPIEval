import javax.net.SocketFactory;
import java.net.InetAddress;
import java.net.Socket;

public class SocketFactory_5 {
    public static void main(String[] args) {
        try {
            SocketFactory factory = SocketFactory.getDefault();
            InetAddress address = InetAddress.getByName("www.example.com");
            int port = 80;
            InetAddress localHost = InetAddress.getLocalHost();
            int localPort = 12345;
            
            Socket socket = factory.createSocket(address, port, localHost, localPort);
            
            System.out.println("Socket created: " + socket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
