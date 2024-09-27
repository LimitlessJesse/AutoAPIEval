import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.Locator;

public class XMLFilterImpl_4 {
    public static void main(String[] args) {
        XMLFilterImpl xmlFilter = new XMLFilterImpl();
        Locator locator = new Locator() {
            @Override
            public String getPublicId() {
                return null;
            }

            @Override
            public String getSystemId() {
                return null;
            }

            @Override
            public int getLineNumber() {
                return 0;
            }

            @Override
            public int getColumnNumber() {
                return 0;
            }
        };
        xmlFilter.setDocumentLocator(locator);
    }
}
