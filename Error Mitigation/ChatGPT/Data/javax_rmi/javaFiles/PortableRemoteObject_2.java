import javax.rmi.PortableRemoteObject;
import java.rmi.Remote;
import java.rmi.NoSuchObjectException;

public class PortableRemoteObject_2 {
    public static void main(String[] args) {
        try {
            // Create a server object
            MyServerObject serverObject = new MyServerObject();
            
            // Get the stub for the server object
            Remote stub = PortableRemoteObject.toStub(serverObject);
            
            // Print the stub
            System.out.println("Stub: " + stub);
        } catch (NoSuchObjectException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MyServerObject implements Remote {
    // Server object implementation
}
