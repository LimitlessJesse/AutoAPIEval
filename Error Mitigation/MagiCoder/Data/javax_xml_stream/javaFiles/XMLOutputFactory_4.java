import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class XMLOutputFactory_4 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            OutputStream os = new FileOutputStream("output.xml");
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(os, "UTF-8");

            // Write XML document
            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeStartElement("root");
            writer.writeCharacters("Hello, World!");
            writer.writeEndElement();
            writer.writeEndDocument();

            // Flush and close
            writer.flush();
            writer.close();
        } catch (XMLStreamException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
