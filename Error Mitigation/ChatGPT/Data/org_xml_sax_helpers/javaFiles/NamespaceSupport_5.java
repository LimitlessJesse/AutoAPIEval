import org.xml.sax.helpers.NamespaceSupport;

public class NamespaceSupport_5 {
    public static void main(String[] args) {
        NamespaceSupport ns = new NamespaceSupport();
        String uri = "http://www.example.com";
        String prefix = ns.getPrefix(uri);
        System.out.println("Prefix for URI " + uri + ": " + prefix);
    }
}
