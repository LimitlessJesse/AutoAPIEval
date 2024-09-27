import org.omg.CosNaming._NamingContextExtStub;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExtPackage.*;

public class _NamingContextExtStub_3 {
    public static void main(String[] args) {
        _NamingContextExtStub namingContext = new _NamingContextExtStub();

        NameComponent[] name = new NameComponent[1];
        name[0] = new NameComponent("example", "txt");

        try {
            namingContext.unbind(name);
            System.out.println("Name binding removed successfully.");
        } catch (NotFound e) {
            System.err.println("Name not found: " + e.getMessage());
        } catch (CannotProceed e) {
            System.err.println("Cannot proceed: " + e.getMessage());
        } catch (InvalidName e) {
            System.err.println("Invalid name: " + e.getMessage());
        }
    }
}
