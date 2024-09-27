import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.util.Iterator;

public class EventReaderDelegate_1 {
    public static void main(String[] args) throws XMLStreamException {
        // Assume we have an EventReaderDelegate named'reader'
        EventReaderDelegate reader = new EventReaderDelegate();

        // Check if there are more events
        boolean hasNext = reader.hasNext();

        System.out.println("There are more events: " + hasNext);
    }
}
