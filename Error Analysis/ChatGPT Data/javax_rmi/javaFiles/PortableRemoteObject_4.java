import javax.rmi.PortableRemoteObject;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class PortableRemoteObject_4 {
    public static void main(String[] args) {
        try {
            // Create a remote object
            Remote remoteObject = new RemoteImpl();

            // Export the remote object
            PortableRemoteObject.exportObject(remoteObject);

            // Unexport the remote object
            PortableRemoteObject.unexportObject(remoteObject);
            
            System.out.println("Remote object unexported successfully");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static class RemoteImpl implements Remote {
        // Remote object implementation
    }
}
