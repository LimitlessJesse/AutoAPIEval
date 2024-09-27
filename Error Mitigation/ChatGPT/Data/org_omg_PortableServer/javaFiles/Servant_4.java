import org.omg.PortableServer.Servant;
import org.omg.PortableServer.Delegate;

public class Servant_4 {
    public static void main(String[] args) {
        Servant servant = new Servant();
        Delegate delegate = servant._get_delegate();
        System.out.println("ORB vendor-specific implementation of PortableServer::Servant: " + delegate);
    }
}
