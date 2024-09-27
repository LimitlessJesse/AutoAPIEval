import javax.net.ssl.SSLSocket;
import java.io.IOException;

public class SSLSocket_1 {
    public static void main(String[] args) {
        try {
            SSLSocket sslSocket = new SSLSocket(); // Create an SSLSocket object
            sslSocket.startHandshake(); // Start the SSL handshake
            System.out.println("SSL handshake completed successfully");
        } catch (IOException e) {
            System.out.println("Error during SSL handshake: " + e.getMessage());
        }
    }
}
