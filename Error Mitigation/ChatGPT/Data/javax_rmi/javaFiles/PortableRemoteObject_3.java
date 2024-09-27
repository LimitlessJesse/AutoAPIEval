import javax.rmi.PortableRemoteObject;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class PortableRemoteObject_3 {
    public static void main(String[] args) {
        try {
            Remote target = new YourRemoteImplementation(); // Replace YourRemoteImplementation with your actual implementation
            Remote source = new YourConnectedRemoteObject(); // Replace YourConnectedRemoteObject with your actual connected object
            
            PortableRemoteObject.connect(target, source);
            
            System.out.println("Connected successfully");
        } catch (RemoteException e) {
            System.out.println("Error connecting: " + e.getMessage());
        }
    }
}
