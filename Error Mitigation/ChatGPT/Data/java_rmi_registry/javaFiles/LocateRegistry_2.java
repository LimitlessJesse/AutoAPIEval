import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class LocateRegistry_2 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("Registry obtained: " + registry);
        } catch (RemoteException e) {
            System.err.println("Error getting registry: " + e.getMessage());
        }
    }
}
