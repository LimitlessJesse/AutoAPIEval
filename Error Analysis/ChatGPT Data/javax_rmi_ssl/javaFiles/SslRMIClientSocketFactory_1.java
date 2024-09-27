import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.net.Socket;

public class SslRMIClientSocketFactory_1 {
    public static void main(String[] args) {
        SslRMIClientSocketFactory factory = new SslRMIClientSocketFactory();
        String host = "example.com";
        int port = 12345;
        
        try {
            Socket socket = factory.createSocket(host, port);
            // Use the socket for further interactions
            System.out.println("Socket created successfully");
        } catch (Exception e) {
            System.out.println("Error creating socket: " + e.getMessage());
        }
    }
}
