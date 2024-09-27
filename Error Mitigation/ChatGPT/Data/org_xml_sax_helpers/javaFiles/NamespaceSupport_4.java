import org.xml.sax.helpers.NamespaceSupport;

public class NamespaceSupport_4 {
    public static void main(String[] args) {
        NamespaceSupport namespaceSupport = new NamespaceSupport();
        String prefix = "xml";
        String uri = namespaceSupport.getURI(prefix);
        System.out.println("Namespace URI for prefix '" + prefix + "': " + uri);
    }
}
