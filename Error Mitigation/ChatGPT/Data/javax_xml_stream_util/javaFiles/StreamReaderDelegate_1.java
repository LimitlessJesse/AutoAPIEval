import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_1 {
    public static void main(String[] args) {
        XMLStreamReader reader = new MyXMLStreamReader();
        try {
            int event = reader.next();
            System.out.println("Current parse event: " + event);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    static class MyXMLStreamReader extends StreamReaderDelegate {
        public MyXMLStreamReader() {
            super();
        }

        @Override
        public int next() throws XMLStreamException {
            // Custom implementation for handling next event
            return super.next();
        }
    }
}
