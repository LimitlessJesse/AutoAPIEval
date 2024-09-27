import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming._NamingContextExtStub;

public class _NamingContextExtStub_2 {
    public static void main(String[] args) {
        NameComponent[] name = new NameComponent[1];
        name[0] = new NameComponent("example", "name");
        
        _NamingContextExtStub context = new _NamingContextExtStub();
        
        String nameAsString = context.to_string(name);
        System.out.println(nameAsString);
    }
}
