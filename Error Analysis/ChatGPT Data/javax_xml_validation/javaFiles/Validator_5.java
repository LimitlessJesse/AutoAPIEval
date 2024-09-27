import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Validator_5 {
    public static void main(String[] args) {

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        
        try {
            Schema schema = factory.newSchema(new StreamSource("schema.xsd"));
            Validator validator = schema.newValidator();
            
            validator.setErrorHandler(new ErrorHandler() {
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
            });
            
            // Perform validation here
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
