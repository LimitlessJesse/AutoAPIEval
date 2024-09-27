import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.io.OutputStream;

public class XMLOutputFactory_3 {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
            OutputStream outputStream = System.out; // Example output stream
            XMLEventWriter eventWriter = factory.createXMLEventWriter(outputStream);
            // Use the eventWriter to write XML events to the output stream
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
