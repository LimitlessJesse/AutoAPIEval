import javax.xml.stream.XMLStreamException;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_70 {
    public static void main(String[] args) throws XMLStreamException {
        StreamReaderDelegate streamReaderDelegate = new StreamReaderDelegate() {
            @Override
            public boolean isEndElement() throws XMLStreamException {
                return super.isEndElement();
            }
        };

        // Use the method
        boolean isEndElement = streamReaderDelegate.isEndElement();
        System.out.println("Is end element: " + isEndElement);
    }
}
