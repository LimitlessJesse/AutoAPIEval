import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;

public class UnicastRemoteObject_5 {
    public static void main(String[] args) {
        try {
            Remote obj = new YourRemoteObject(); // YourRemoteObject should implement Remote interface
            int port = 1099; // Example port number
            Remote stub = UnicastRemoteObject.exportObject(obj, port);
            System.out.println("Remote object exported successfully");
        } catch (RemoteException e) {
            System.err.println("Error exporting remote object: " + e.getMessage());
        }
    }
}
