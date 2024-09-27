import org.omg.PortableServer.Servant;

public class Servant_3 {
    public static void main(String[] args) {
        Servant servant = new Servant();
        Delegate delegate = new Delegate(); // Assuming Delegate class exists
        servant._set_delegate(delegate);
    }
}
