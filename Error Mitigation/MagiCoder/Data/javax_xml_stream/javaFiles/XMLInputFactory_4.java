import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class XMLInputFactory_4 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            InputStream in = XMLInputFactory_4.class.getResourceAsStream("/sample.xml");
            XMLStreamReader reader = factory.createXMLStreamReader("sample.xml", in);
            // Use the reader here...
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
