import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLOutputFactory_2 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream("output.xml"));

            // Start writing XML
            writer.writeStartDocument();
            writer.writeStartElement("root");
            writer.writeCharacters("Hello, World!");
            writer.writeEndElement();
            writer.writeEndDocument();

            // Flush and close the writer
            writer.flush();
            writer.close();
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }
}
