import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;

public class XMLOutputFactory_3 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            StringWriter stringWriter = new StringWriter();
            XMLStreamWriter xmlStreamWriter = outputFactory.createXMLStreamWriter(stringWriter);

            // Start writing XML
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("root");
            xmlStreamWriter.writeCharacters("Hello, World!");
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            // Flush the writer
            xmlStreamWriter.flush();

            // Print the XML
            System.out.println(stringWriter.toString());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
