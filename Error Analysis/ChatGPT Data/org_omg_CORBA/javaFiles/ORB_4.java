import org.omg.CORBA.ORB;

public class ORB_4 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        
        // Perform some ORB operations
        
        orb.shutdown(true); // Initiates shutdown and waits for completion
        
        System.out.println("ORB shutdown completed.");
    }
}
