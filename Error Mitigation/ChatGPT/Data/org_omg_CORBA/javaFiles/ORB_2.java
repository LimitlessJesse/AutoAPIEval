import org.omg.CORBA.ORB;

public class ORB_2 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        
        // Assuming obj is the servant object to be disconnected
        orb.disconnect(obj);
    }
}
