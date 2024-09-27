import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class DocumentBuilder_3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Set an error handler
            builder.setErrorHandler(new ErrorHandler() {
                @Override
                public void warning(SAXParseException exception) {
                    System.out.println("Warning: " + exception.getMessage());
                }

                @Override
                public void error(SAXParseException exception) {
                    System.out.println("Error: " + exception.getMessage());
                }

                @Override
                public void fatalError(SAXParseException exception) {
                    System.out.println("Fatal Error: " + exception.getMessage());
                }
            });

            // Parse an XML document
            Document doc = builder.parse("non-existent.xml");
            System.out.println("Document parsed successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
