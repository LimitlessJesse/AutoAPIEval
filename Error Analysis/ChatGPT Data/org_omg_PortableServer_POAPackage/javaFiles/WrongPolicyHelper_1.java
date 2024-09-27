import org.omg.PortableServer.POAPackage.WrongPolicyHelper;

public class WrongPolicyHelper_1 {
    public static void main(String[] args) {
        WrongPolicyHelper helper = new WrongPolicyHelper();
        String id = helper.id();
        System.out.println("Object ID: " + id);
    }
}
