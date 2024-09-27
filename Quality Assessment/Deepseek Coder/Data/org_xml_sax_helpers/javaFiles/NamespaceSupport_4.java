import org.xml.sax.helpers.NamespaceSupport;

public class NamespaceSupport_4 {
    public static void main(String[] args) {
        NamespaceSupport ns = new NamespaceSupport();
        ns.declarePrefix("x", "http://www.example.com/x");
        String prefix = ns.getPrefix("http://www.example.com/x");
        System.out.println(prefix);  // Output: "x"
    }
}
