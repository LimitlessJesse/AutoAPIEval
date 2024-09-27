import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;
import java.io.OutputStream;

public class XMLOutputFactory_5 {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
            OutputStream outputStream = System.out; // Example output stream
            XMLStreamWriter writer = factory.createXMLStreamWriter(outputStream);
            writer.writeStartDocument();
            writer.writeStartElement("root");
            writer.writeCharacters("Hello, XMLStreamWriter!");
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
