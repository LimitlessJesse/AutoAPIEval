import javax.management.remote.rmi.RMIConnectorServer;
import java.io.IOException;

public class RMIConnectorServer_2 {
    public static void main(String[] args) {
        RMIConnectorServer connectorServer = new RMIConnectorServer();
        
        try {
            connectorServer.stop();
            System.out.println("Connector server stopped successfully.");
        } catch (IOException e) {
            System.err.println("Error stopping connector server: " + e.getMessage());
        }
    }
}
