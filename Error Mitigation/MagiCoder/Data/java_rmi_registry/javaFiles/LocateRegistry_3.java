import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocateRegistry_3 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            System.out.println("Registry found: " + registry);
        } catch (Exception e) {
            System.err.println("Registry not found: " + e);
        }
    }
}
