import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class XMLInputFactory_4 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader("systemId", System.in);
            // Use the XMLStreamReader object for further processing
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
