import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class ServerSocketFactory_3 {
    public static void main(String[] args) {
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(8080, 50, InetAddress.getLocalHost());
            System.out.println("ServerSocket created on port 8080");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
