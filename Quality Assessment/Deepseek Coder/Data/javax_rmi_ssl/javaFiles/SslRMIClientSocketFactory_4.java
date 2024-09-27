import java.io.IOException;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.net.Socket;

public class SslRMIClientSocketFactory_4 {
    public static void main(String[] args) {
        try {
            SslRMIClientSocketFactory sslFactory = new SslRMIClientSocketFactory();
            Socket socket = sslFactory.createSocket("example.com", 443);
            System.out.println("Socket created successfully!");
        } catch (IOException e) {
            System.out.println("Failed to create socket: " + e.getMessage());
        }
    }
}
