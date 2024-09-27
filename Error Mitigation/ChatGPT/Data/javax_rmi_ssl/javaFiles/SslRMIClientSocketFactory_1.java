import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SslRMIClientSocketFactory_1 {
    public static void main(String[] args) {
        SslRMIClientSocketFactory factory = new SslRMIClientSocketFactory();
        try {
            Socket socket = factory.createSocket("example.com", 8080);
            // Use the socket for communication
            socket.close(); // Close the socket when done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
