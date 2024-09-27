import org.xml.sax.helpers.NamespaceSupport;

public class NamespaceSupport_2 {
    public static void main(String[] args) {
        NamespaceSupport ns = new NamespaceSupport();
        ns.pushContext();
        ns.declarePrefix("prefix", "http://example.com");
        String uri = ns.getURI("prefix");
        System.out.println("URI for prefix: " + uri);
    }
}
