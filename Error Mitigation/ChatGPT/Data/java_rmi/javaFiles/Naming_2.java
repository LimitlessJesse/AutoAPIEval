import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.AlreadyBoundException;
import java.rmi.MalformedURLException;
import java.rmi.RemoteException;

public class Naming_2 {
    public static void main(String[] args) {
        try {
            Remote remoteObj = new RemoteObject(); // Assuming RemoteObject is a class that implements Remote interface
            Naming.bind("rmi://localhost:1099/RemoteObject", remoteObj);
            System.out.println("Remote object bound successfully.");
        } catch (AlreadyBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
