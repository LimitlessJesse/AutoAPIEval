import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;

public class ServerSocketFactory_4 {
    public static void main(String[] args) {
        int port = 8080;
        int backlog = 50;
        InetAddress ifAddress = null; // You can provide the InetAddress here if needed

        ServerSocketFactory factory = ServerSocketFactory.getDefault();
        try (ServerSocket serverSocket = factory.createServerSocket(port, backlog, ifAddress)) {
            System.out.println("ServerSocket created at port: " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
