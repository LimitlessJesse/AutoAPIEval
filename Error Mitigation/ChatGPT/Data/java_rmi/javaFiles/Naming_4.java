import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;

public class Naming_4 {
    public static void main(String[] args) {
        try {
            Naming.unbind("rmi://localhost:1099/MyRemoteObject");
            System.out.println("Binding destroyed successfully.");
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
