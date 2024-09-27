import org.omg.CORBA.ORB;

public class ORB_5 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        
        // Creating a policy of type 1 with value "example"
        org.omg.CORBA.Policy policy = orb.create_policy(1, "example");
        
        System.out.println("Created Policy: " + policy);
    }
}
