import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;

public class XMLOutputFactory_1 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = factory.createXMLStreamWriter(System.out);

            writer.writeStartDocument();
            writer.writeStartElement("root");
            writer.writeCharacters("Hello, World!");
            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
