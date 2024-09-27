import javax.management.remote.rmi.RMIConnectorServer;
import java.io.IOException;

public class RMIConnectorServer_1 {
    public static void main(String[] args) {
        RMIConnectorServer connectorServer = new RMIConnectorServer();
        
        try {
            connectorServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
