import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocateRegistry_2 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("Got the RMI registry");
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
