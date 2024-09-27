import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.InputStream;

public class XMLInputFactory_2 {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            InputStream in = XMLInputFactory_2.class.getResourceAsStream("/sample.xml");
            factory.createXMLStreamReader(in);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
