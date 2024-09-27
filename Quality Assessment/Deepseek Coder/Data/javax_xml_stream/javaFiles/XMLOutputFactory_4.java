import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XMLOutputFactory_4 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileWriter("output.xml"));

            // Start writing the XML document
            writer.writeStartDocument();

            // Write the root element
            writer.writeStartElement("root");

            // Write an attribute
            writer.writeAttribute("attr", "value");

            // Write some text
            writer.writeCharacters("Hello, World!");

            // Close the root element
            writer.writeEndElement();

            // End the document
            writer.writeEndDocument();

            // Flush and close the writer
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
