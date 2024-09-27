import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_4 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new java.io.StringReader("<root>Hello, World!</root>"));
            StreamReaderDelegate delegate = new StreamReaderDelegate(reader) {
                @Override
                public String getText() {
                    try {
                        return super.getText();
                    } catch (XMLStreamException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            };
            while (delegate.hasNext()) {
                delegate.next();
                if (delegate.isStartElement() && delegate.getLocalName().equals("root")) {
                    System.out.println(delegate.getText());
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
