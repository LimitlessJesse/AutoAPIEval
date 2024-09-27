import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.StringReader;

public class StreamReaderDelegate_1 {
    public static void main(String[] args) throws XMLStreamException {
        String xml = "<root>Hello World</root>";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        StreamReaderDelegate reader = new StreamReaderDelegate();
        reader.setInput(factory.createXMLStreamReader(new StringReader(xml)));
        String elementText = reader.getElementText();
        System.out.println(elementText);
    }
}
