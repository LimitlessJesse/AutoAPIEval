import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;
import java.io.StringWriter;

public class XMLOutputFactory_4 {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        StringWriter stringWriter = new StringWriter();
        
        try {
            XMLStreamWriter xmlStreamWriter = factory.createXMLStreamWriter(stringWriter);
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("root");
            xmlStreamWriter.writeCharacters("Hello, XMLStreamWriter!");
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.flush();
            xmlStreamWriter.close();
            
            System.out.println(stringWriter.toString());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
