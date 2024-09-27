import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class LocateRegistry_1 {
    public static void main(String[] args) {
        try {
            int port = 1099;
            Registry registry = LocateRegistry.createRegistry(port);
            System.out.println("Registry created on port: " + port);
        } catch (RemoteException e) {
            System.err.println("Error creating registry: " + e.getMessage());
        }
    }
}
