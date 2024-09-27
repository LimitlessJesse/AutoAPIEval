import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.EventReaderDelegate;

public class EventReaderDelegate_2 {
    public static void main(String[] args) throws XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader reader = factory.createXMLEventReader("your_xml_file.xml");
        
        EventReaderDelegate eventReaderDelegate = new EventReaderDelegate(reader) {
            @Override
            public boolean hasNext() {
                return super.hasNext();
            }
        };
        
        System.out.println("Has next event: " + eventReaderDelegate.hasNext());
    }
}
