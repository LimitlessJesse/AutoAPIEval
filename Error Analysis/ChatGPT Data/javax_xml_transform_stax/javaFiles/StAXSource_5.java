import javax.xml.transform.stax.StAXSource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class StAXSource_5 {
    public static void main(String[] args) {
        try {
            String xmlString = "<root>Hello World!</root>";
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xmlString));
            StAXSource source = new StAXSource(reader);

            source.setSystemId("https://example.com/xml");

            System.out.println("System ID set to: " + source.getSystemId());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
    }
}
