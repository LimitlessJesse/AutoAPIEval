import javax.net.SocketFactory;
import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;

public class SocketFactory_4 {
    public static void main(String[] args) {
        try {
            SocketFactory factory = SocketFactory.getDefault();
            InetAddress localHost = InetAddress.getByName("127.0.0.1");
            int localPort = 12345;
            
            Socket socket = factory.createSocket("www.example.com", 80, localHost, localPort);
            
            System.out.println("Socket created: " + socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
