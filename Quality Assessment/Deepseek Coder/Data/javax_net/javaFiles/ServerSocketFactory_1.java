import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;

public class ServerSocketFactory_1 {
    public static void main(String[] args) {
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(8080);
            System.out.println("ServerSocket created on port: " + serverSocket.getLocalPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
