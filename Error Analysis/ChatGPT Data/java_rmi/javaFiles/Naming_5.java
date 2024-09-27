import java.rmi.Naming;
import java.rmi.Remote;

public class Naming_5 {
    public static void main(String[] args) {
        try {
            Remote remoteObject = new RemoteObject();
            Naming.bind("remoteObject", remoteObject);
            System.out.println("Bound remote object successfully");
        } catch (Exception e) {
            System.out.println("Error binding remote object: " + e.getMessage());
        }
    }
}

class RemoteObject implements Remote {
    // Implementation of the Remote interface
}
