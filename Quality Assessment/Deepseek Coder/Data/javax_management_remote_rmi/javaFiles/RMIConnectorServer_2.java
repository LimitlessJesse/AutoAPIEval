import javax.management.remote.rmi.RMIConnectorServer;
import javax.management.remote.rmi.RMIConnectorServerFactory;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            RMIConnectorServer connector = RMIConnectorServerFactory.createRMIConnectorServer(registry);
            connector.start();

            // Add your server code here

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
