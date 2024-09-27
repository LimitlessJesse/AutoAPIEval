import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.StringReader;

public class XMLReaderAdapter_2 {
    public static void main(String[] args) {
        try {
            // Create a SAXParserFactory
            SAXParserFactory factory = SAXParserFactory.newInstance();

            // Create a SAXParser
            SAXParser saxParser = factory.newSAXParser();

            // Get the XMLReader from the SAXParser
            XMLReaderAdapter xmlReader = new XMLReaderAdapter(saxParser.getXMLReader());

            // Parse an XML document
            xmlReader.parse(new InputSource(new StringReader("<root>Hello, World!!!</root>")));

            System.out.println("XML document parsed successfully");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
