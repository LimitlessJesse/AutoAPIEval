import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerHandler;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.SAXException;

public class SAXTransformerFactory_3 {
    public static void main(String[] args) {
        try {
            // Create a SAXTransformerFactory instance
            SAXTransformerFactory factory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();

            // Create a StreamSource for the input source
            StreamSource source = new StreamSource("input.xml");

            // Create a new TransformerHandler using newTransformerHandler method
            TransformerHandler handler = factory.newTransformerHandler(source);

            // Proceed with handling the transformation
            // handler.startDocument();
            // handler.startElement("", "", "root", null);
            // handler.endElement("", "", "root");
            // handler.endDocument();
        } catch (TransformerConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }
}
