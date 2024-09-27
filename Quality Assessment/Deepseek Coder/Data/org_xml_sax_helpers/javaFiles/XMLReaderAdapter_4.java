import org.xml.sax.helpers.XMLReaderAdapter;
import org.xml.sax.DTDHandler;

public class XMLReaderAdapter_4 {
    public static void main(String[] args) {
        XMLReaderAdapter xmlReaderAdapter = new XMLReaderAdapter();

        // Define a DTDHandler
        DTDHandler dtdHandler = new DTDHandler() {
            @Override
            public void notationDecl(String name, String publicId, String systemId) {
                System.out.println("Notation declaration: " + name + ", " + publicId + ", " + systemId);
            }

            @Override
            public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) {
                System.out.println("Unparsed entity declaration: " + name + ", " + publicId + ", " + systemId + ", " + notationName);
            }
        };

        // Set the DTDHandler
        xmlReaderAdapter.setDTDHandler(dtdHandler);
    }
}
