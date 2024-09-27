import org.w3c.dom.bootstrap.DOMImplementationRegistry;

public class DOMImplementationRegistry_3 {
    public static void main(String[] args) {
        try {
            DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
            System.out.println("DOMImplementationRegistry instance created successfully");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ClassCastException e) {
            e.printStackTrace();
        }
    }
}
