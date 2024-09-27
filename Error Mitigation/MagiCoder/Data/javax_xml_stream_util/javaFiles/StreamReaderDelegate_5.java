import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_5 {
    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new java.io.StringReader("<root>Hello</root>"));
        StreamReaderDelegate delegate = new StreamReaderDelegate(reader);

        // Move to the START_ELEMENT event
        while (!delegate.isStartElement()) {
            delegate.next();
        }

        // Get the local name of the current event
        String localName = delegate.getLocalName();
        System.out.println(localName);  // Output: root
    }
}
