import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.io.StringWriter;

public class XMLOutputFactory_2 {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
            StringWriter stringWriter = new StringWriter();
            XMLEventWriter eventWriter = factory.createXMLEventWriter(stringWriter);
            eventWriter.add(factory.createStartDocument());
            eventWriter.add(factory.createStartElement("", "", "root"));
            eventWriter.add(factory.createEndElement("", "", "root"));
            eventWriter.add(factory.createEndDocument());
            eventWriter.close();
            System.out.println(stringWriter.toString());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
