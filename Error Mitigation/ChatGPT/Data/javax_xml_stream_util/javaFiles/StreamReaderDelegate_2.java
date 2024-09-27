import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_2 {
    public static void main(String[] args) {
        XMLStreamReader reader = new StreamReaderDelegate() {
            @Override
            public int nextTag() throws XMLStreamException {
                int eventType = next();
                while ((eventType == XMLStreamConstants.CHARACTERS && isWhiteSpace()) || (eventType == XMLStreamConstants.CDATA && isWhiteSpace()) || eventType == XMLStreamConstants.SPACE || eventType == XMLStreamConstants.PROCESSING_INSTRUCTION || eventType == XMLStreamConstants.COMMENT) {
                    eventType = next();
                }
                if (eventType != XMLStreamConstants.START_ELEMENT && eventType != XMLStreamConstants.END_ELEMENT) {
                    throw new XMLStreamException("expected start or end tag", getLocation());
                }
                return eventType;
            }
        };
    }
}
