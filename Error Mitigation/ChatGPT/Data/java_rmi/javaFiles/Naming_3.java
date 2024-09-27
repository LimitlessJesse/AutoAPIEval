import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class Naming_3 {
    public static void main(String[] args) {
        try {
            // Create a new remote object
            RemoteObject remoteObj = new RemoteObject();
            
            // Rebind the remote object to a name
            Naming.rebind("remoteObject", remoteObj);
            
            System.out.println("Remote object bound successfully.");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

// Sample RemoteObject class
class RemoteObject implements Remote {
    // Remote object implementation
}
