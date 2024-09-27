import org.xml.sax.helpers.NamespaceSupport;

public class NamespaceSupport_3 {
    public static void main(String[] args) {
        NamespaceSupport ns = new NamespaceSupport();
        ns.declarePrefix("x", "http://www.example.com/x");
        String uri = ns.getURI("x");
        System.out.println(uri);  // Outputs: http://www.example.com/x
    }
}
