import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLOutputFactory_3 {
    public static void main(String[] args) throws Exception {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        OutputStream output = new FileOutputStream("example.xml");
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(output, "UTF-8");

        writer.writeStartDocument("UTF-8", "1.0");
        writer.writeStartElement("root");
        writer.writeCharacters("Hello, World!");
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();
    }
}
