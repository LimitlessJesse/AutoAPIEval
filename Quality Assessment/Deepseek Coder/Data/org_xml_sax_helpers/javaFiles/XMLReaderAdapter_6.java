import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLReaderAdapter;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XMLReaderAdapter_6 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            XMLReaderAdapter xmlReader = new XMLReaderAdapter(parser.getXMLReader());

            // Define an error handler
            ErrorHandler errorHandler = new ErrorHandler() {
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
            };

            // Set the error handler
            xmlReader.setErrorHandler(errorHandler);

            // Parse an XML document
            xmlReader.parse("path_to_your_xml_file");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
