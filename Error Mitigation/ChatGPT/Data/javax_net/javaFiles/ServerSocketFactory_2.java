import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketFactory_2 {
    public static void main(String[] args) {
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(8080, 50);
            System.out.println("ServerSocket created on port 8080 with a backlog of 50");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
