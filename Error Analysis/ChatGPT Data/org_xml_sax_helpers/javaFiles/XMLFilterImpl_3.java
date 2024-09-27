import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_3 {
    public static void main(String[] args) {
        XMLFilterImpl xmlFilter = new XMLFilterImpl();
        xmlFilter.startPrefixMapping("prefix", "http://example.com");
    }
}
