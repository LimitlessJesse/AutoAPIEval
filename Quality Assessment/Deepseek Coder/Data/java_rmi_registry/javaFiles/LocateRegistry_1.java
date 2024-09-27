import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocateRegistry_1 {
    public static void main(String[] args) {
        try {
            // Get the registry on the default port
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("Registry found on port: " + registry.getRegistryPort());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
