import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SchemaFactory_2 {
    public static void main(String[] args) {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        
        ErrorHandler customErrorHandler = new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                System.out.println("Warning: " + exception.getMessage());
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                System.out.println("Error: " + exception.getMessage());
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                System.out.println("Fatal Error: " + exception.getMessage());
            }
        };
        
        schemaFactory.setErrorHandler(customErrorHandler);
        // Further code for using the schemaFactory with the custom error handler
    }
}
