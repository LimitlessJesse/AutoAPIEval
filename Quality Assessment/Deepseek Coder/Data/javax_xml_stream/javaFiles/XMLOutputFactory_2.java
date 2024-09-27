import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLOutputFactory_2 {
    public static void main(String[] args) throws Exception {
        // Create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();

        // Create an OutputStream to write the XML data to a file
        OutputStream output = new FileOutputStream("output.xml");

        // Create an XMLStreamWriter using the XMLOutputFactory and the OutputStream
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(output);

        // Start the document
        writer.writeStartDocument();

        // Write a root element
        writer.writeStartElement("root");

        // Write some child elements
        writer.writeStartElement("child");
        writer.writeCharacters("Hello, World!");
        writer.writeEndElement();

        // End the root element
        writer.writeEndElement();

        // End the document
        writer.writeEndDocument();

        // Flush and close the writer
        writer.flush();
        writer.close();
    }
}
