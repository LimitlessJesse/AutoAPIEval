import javax.rmi.ssl.SslRMIServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocket;

public class SslRMIServerSocketFactory_1 {
    public static void main(String[] args) {
        int port = 8080;
        SslRMIServerSocketFactory factory = new SslRMIServerSocketFactory();
        
        try {
            ServerSocket serverSocket = factory.createServerSocket(port);
            if (serverSocket instanceof SSLServerSocket) {
                System.out.println("SSL ServerSocket created on port " + port);
            } else {
                System.out.println("ServerSocket created on port " + port);
            }
        } catch (IOException e) {
            System.err.println("Error creating server socket: " + e.getMessage());
        }
    }
}
