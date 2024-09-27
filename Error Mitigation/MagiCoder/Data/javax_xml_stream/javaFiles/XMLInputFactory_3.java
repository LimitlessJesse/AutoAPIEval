import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.StringReader;

public class XMLInputFactory_3 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            String xml = "<root>Hello, World!</root>";
            StringReader reader = new StringReader(xml);
            factory.createXMLStreamReader(reader);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
