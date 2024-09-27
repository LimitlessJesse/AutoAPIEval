import javax.rmi.PortableRemoteObject;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class PortableRemoteObject_4 {
    public static void main(String[] args) {
        // Create a server object to export
        Remote serverObject = new ServerObject();
        
        try {
            // Export the server object
            PortableRemoteObject.exportObject(serverObject);
            System.out.println("Server object exported successfully.");
        } catch (RemoteException e) {
            System.err.println("Error exporting server object: " + e.getMessage());
        }
    }
}

// Sample server object implementation
class ServerObject implements Remote {
    // Server object implementation
}
