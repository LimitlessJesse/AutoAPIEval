import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class LocateRegistry_1 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Registry created on port 1099");
        } catch (RemoteException e) {
            System.err.println("Error creating registry: " + e.getMessage());
        }
    }
}
