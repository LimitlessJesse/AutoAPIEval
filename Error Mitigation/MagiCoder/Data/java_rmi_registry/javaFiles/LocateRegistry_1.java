import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocateRegistry_1 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            System.out.println("Registry found: " + registry);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
