import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;

public class ORB_3 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        try {
            orb.destroy();
        } catch (InvalidName e) {
            e.printStackTrace();
        }
    }
}
