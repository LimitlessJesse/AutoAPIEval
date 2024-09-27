import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class Naming_4 {
    public static void main(String[] args) {
        try {
            Naming.unbind("rmi://localhost:1099/MyObject");
            System.out.println("Unbound successfully");
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
