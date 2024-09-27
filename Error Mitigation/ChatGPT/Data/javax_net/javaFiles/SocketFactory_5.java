import javax.net.SocketFactory;
import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;

public class SocketFactory_5 {
    public static void main(String[] args) {
        SocketFactory socketFactory = SocketFactory.getDefault();
        try {
            InetAddress address = InetAddress.getByName("www.example.com");
            int port = 80;
            InetAddress localAddress = InetAddress.getLocalHost();
            int localPort = 12345;
            
            Socket socket = socketFactory.createSocket(address, port, localAddress, localPort);
            
            // Use the created socket for communication
            
            socket.close(); // Close the socket when done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
