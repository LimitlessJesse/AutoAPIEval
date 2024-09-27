import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.DOMImplementation;

public class DOMImplementationRegistry_1 {
    public static void main(String[] args) {
        DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
        DOMImplementation implementation = registry.getDOMImplementation("Core");
        System.out.println(implementation);
    }
}
