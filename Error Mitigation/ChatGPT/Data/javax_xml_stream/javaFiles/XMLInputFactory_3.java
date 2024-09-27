import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;

public class XMLInputFactory_3 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(null);
            // Use the XMLStreamReader object for further processing
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
