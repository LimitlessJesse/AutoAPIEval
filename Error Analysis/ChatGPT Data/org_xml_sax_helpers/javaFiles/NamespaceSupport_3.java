import org.xml.sax.helpers.NamespaceSupport;

public class NamespaceSupport_3 {
    public static void main(String[] args) {
        NamespaceSupport ns = new NamespaceSupport();
        
        // Add some prefixes
        ns.declarePrefix("xml", "http://www.w3.org/XML/1998/namespace");
        ns.declarePrefix("xlink", "http://www.w3.org/1999/xlink");
        
        // Get all prefixes
        Enumeration prefixes = ns.getPrefixes();
        while (prefixes.hasMoreElements()) {
            String prefix = (String) prefixes.nextElement();
            System.out.println("Prefix: " + prefix);
        }
    }
}
