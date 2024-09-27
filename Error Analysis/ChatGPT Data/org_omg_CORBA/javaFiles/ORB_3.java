import org.omg.CORBA.ORB;

public class ORB_3 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        orb.run();
    }
}
