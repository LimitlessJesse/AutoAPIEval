import javax.rmi.CORBA.Util;
import org.omg.CORBA.ORB;
import java.rmi.RemoteException;

public class Util_3 {
    public static void main(String[] args) {
        Object[] objects = {new Object(), new Object()};
        ORB orb = ORB.init(args, null);
        
        try {
            Object[] copiedObjects = Util.copyObjects(objects, orb);
            System.out.println("Copied objects: " + copiedObjects);
        } catch (RemoteException e) {
            System.err.println("Error copying or connecting objects: " + e.getMessage());
        }
    }
}
