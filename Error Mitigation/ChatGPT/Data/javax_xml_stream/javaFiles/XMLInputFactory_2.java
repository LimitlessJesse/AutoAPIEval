import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class XMLInputFactory_2 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            InputStream inputStream = // provide input stream here
            XMLStreamReader reader = factory.createXMLStreamReader(inputStream);
            // Use the XMLStreamReader object for further processing
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
