import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class LocateRegistry_3 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            System.out.println("Remote object registry obtained: " + registry);
        } catch (RemoteException e) {
            System.err.println("Error getting registry: " + e.getMessage());
        }
    }
}
