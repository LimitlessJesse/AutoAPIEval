import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class Naming_5 {
    public static void main(String[] args) {
        try {
            String[] names = Naming.list("//localhost");
            for (String name : names) {
                System.out.println(name);
            }
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
