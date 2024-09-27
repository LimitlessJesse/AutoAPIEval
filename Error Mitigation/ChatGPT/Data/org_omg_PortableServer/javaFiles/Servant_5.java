import org.omg.PortableServer.Servant;
import org.omg.PortableServer.POA;

public class Servant_5 {
    public static void main(String[] args) {
        Servant servant = new Servant();
        POA poa = servant._default_POA();
        System.out.println("Default POA: " + poa);
    }
}
