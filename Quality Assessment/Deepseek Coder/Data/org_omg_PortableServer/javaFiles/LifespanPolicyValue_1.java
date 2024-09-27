import org.omg.PortableServer.LifespanPolicy;
import org.omg.PortableServer.LifespanPolicyValueHelper;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidPolicy;

public class LifespanPolicyValue_1 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        try {
            LifespanPolicy lifespanPolicy = LifespanPolicyHelper.narrow(orb.resolve_initial_references("LifespanService"));
            int value = lifespanPolicy.value();
            System.out.println("LifespanPolicy value: " + value);
        } catch (InvalidPolicy e) {
            e.printStackTrace();
        }
    }
}
