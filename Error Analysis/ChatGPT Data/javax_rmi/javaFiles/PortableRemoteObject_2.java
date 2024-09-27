import javax.rmi.PortableRemoteObject;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class PortableRemoteObject_2 {

    public static void main(String[] args) {
        // Create a remote object
        Remote remoteObject = new Remote() {
            @Override
            public String toString() {
                return "Remote object";
            }
        };

        try {
            // Export the remote object
            PortableRemoteObject.exportObject(remoteObject);
            System.out.println("Remote object exported successfully.");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
