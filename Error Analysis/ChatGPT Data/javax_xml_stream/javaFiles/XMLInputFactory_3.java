import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLEventReader;
import java.io.StringReader;

public class XMLInputFactory_3 {
    public static void main(String[] args) {
        String xmlString = "<root>Hello World!</root>";
        
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader reader = factory.createXMLEventReader(new StringReader(xmlString));
            
            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();
                System.out.println(event.toString());
            }
            
            reader.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
