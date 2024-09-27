import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class ORB_2 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        NamingContext namingContext = null;

        try {
            namingContext = (NamingContext) orb.resolve_initial_references("NameService");
        } catch (InvalidName e) {
            e.printStackTrace();
        }

        try {
            System.out.println(namingContext.resolve("test"));
        } catch (NotFound e) {
            e.printStackTrace();
        }
    }
}
