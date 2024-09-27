import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.DOMImplementation;

public class DOMImplementationRegistry_1 {
    public static void main(String[] args) {
        try {
            DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
            DOMImplementation domImpl = registry.getDOMImplementation("XML 1.0 Traversal +Events 2.0");
            System.out.println("DOM Implementation: " + domImpl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
