import javax.xml.stream.Location;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_4 {
    public static void main(String[] args) {
        String xml = "<root><element>Content</element></root>";

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new java.io.StringReader(xml));
            StreamReaderDelegate delegate = new StreamReaderDelegate(reader) {};

            while (delegate.hasNext()) {
                int event = delegate.next();
                if (event == XMLStreamReader.START_ELEMENT) {
                    Location location = delegate.getLocation();
                    System.out.println("Element Location: line " + location.getLineNumber() + ", column " + location.getColumnNumber());
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
