import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class LocateRegistry_2 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Registry created on port: " + registry.getPort());
        } catch (RemoteException e) {
            System.out.println("Failed to create Registry: " + e.getMessage());
        }
    }
}
