import javax.rmi.ssl.SslRMIServerSocketFactory;

import java.io.IOException;
import java.net.ServerSocket;

public class SslRMIServerSocketFactory_1 {
    public static void main(String[] args) {
        SslRMIServerSocketFactory factory = new SslRMIServerSocketFactory();
        try {
            ServerSocket serverSocket = factory.createServerSocket(1099);
            System.out.println("Server socket created on port 1099");
        } catch (IOException e) {
            System.err.println("Error creating server socket: " + e.getMessage());
        }
    }
}
