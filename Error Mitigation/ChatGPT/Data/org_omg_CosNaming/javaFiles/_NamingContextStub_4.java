import org.omg.CosNaming._NamingContextStub;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextPackage.*;

public class _NamingContextStub_4 {
    public static void main(String[] args) {
        _NamingContextStub namingContext = new _NamingContextStub();
        NameComponent[] name = new NameComponent[1];
        name[0] = new NameComponent("example", "txt");
        
        try {
            namingContext.unbind(name);
            System.out.println("Name binding removed successfully.");
        } catch (NotFound e) {
            System.out.println("Name not found.");
        } catch (CannotProceed e) {
            System.out.println("Operation cannot proceed.");
        } catch (InvalidName e) {
            System.out.println("Invalid name.");
        }
    }
}
