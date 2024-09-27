import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.EventReaderDelegate;

public class EventReaderDelegate_1 {
    public static void main(String[] args) {
        EventReaderDelegate eventReader = new EventReaderDelegate() {
            @Override
            public XMLEvent nextEvent() throws XMLStreamException {
                // Implement custom logic here
                return super.nextEvent();
            }
        };
    }
}
