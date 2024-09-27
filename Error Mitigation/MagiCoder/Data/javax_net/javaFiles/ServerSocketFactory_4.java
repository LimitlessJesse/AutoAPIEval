import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.SocketException;
import javax.net.ServerSocketFactory;

public class ServerSocketFactory_4 {
    public static void main(String[] args) {
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(8080, 50, InetAddress.getByName("localhost"));
            System.out.println("Server socket created successfully.");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
