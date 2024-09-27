import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_5 {
    public static void main(String[] args) {
        XMLStreamReader reader = null; // Initialize your XMLStreamReader object
        StreamReaderDelegate delegate = new StreamReaderDelegate(reader);

        String localName = delegate.getLocalName();
        System.out.println("Local Name: " + localName);
    }
}
