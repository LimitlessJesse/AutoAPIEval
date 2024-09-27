import org.xml.sax.helpers.XMLReaderAdapter;
import org.xml.sax.ErrorHandler;

public class XMLReaderAdapter_4 {
    public static void main(String[] args) {
        XMLReaderAdapter xmlReaderAdapter = new XMLReaderAdapter();
        xmlReaderAdapter.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(org.xml.sax.SAXParseException exception) {
                System.out.println("Warning: " + exception.getMessage());
            }

            @Override
            public void error(org.xml.sax.SAXParseException exception) {
                System.out.println("Error: " + exception.getMessage());
            }

            @Override
            public void fatalError(org.xml.sax.SAXParseException exception) {
                System.out.println("Fatal Error: " + exception.getMessage());
            }
        });
    }
}
