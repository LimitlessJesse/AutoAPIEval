import javax.management.remote.rmi.RMIConnectorServer;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIConnectorServer_2 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            RMIConnectorServer rmiConnectorServer = new RMIConnectorServer();
            rmiConnectorServer.start();
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
