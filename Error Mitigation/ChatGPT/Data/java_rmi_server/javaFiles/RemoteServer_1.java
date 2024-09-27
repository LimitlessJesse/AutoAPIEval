import java.rmi.server.RemoteServer;
import java.rmi.server.ServerNotActiveException;

public class RemoteServer_1 {
    public static void main(String[] args) {
        try {
            String clientHost = RemoteServer.getClientHost();
            System.out.println("Client host: " + clientHost);
        } catch (ServerNotActiveException e) {
            System.err.println("ServerNotActiveException: " + e.getMessage());
        }
    }
}
