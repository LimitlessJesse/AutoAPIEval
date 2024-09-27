import org.omg.CosNaming._NamingContextExtStub;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class _NamingContextExtStub_4 {
    public static void main(String[] args) {
        _NamingContextExtStub namingContext = new _NamingContextExtStub();
        try {
            org.omg.CosNaming.NamingContext newContext = namingContext.new_context();
            System.out.println("New context created: " + newContext);
        } catch (CannotProceed | InvalidName | NotFound e) {
            e.printStackTrace();
        }
    }
}
