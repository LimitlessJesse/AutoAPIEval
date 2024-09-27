import java.rmi.server.RMISocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class RMISocketFactory_1 {
    public static void main(String[] args) {
        RMISocketFactory factory = RMISocketFactory.getDefaultSocketFactory();
        
        try {
            ServerSocket serverSocket = factory.createServerSocket(1099);
            System.out.println("Server socket created on port 1099");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the server socket: " + e.getMessage());
        }
    }
}
