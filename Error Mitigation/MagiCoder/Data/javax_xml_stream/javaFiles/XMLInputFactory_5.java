import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLInputFactory_5 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        String xml = "<root>Hello, World!</root>";
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xml));
            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamReader.START_ELEMENT) {
                    System.out.println("Start element: " + reader.getLocalName());
                } else if (event == XMLStreamReader.CHARACTERS) {
                    System.out.println("Characters: " + reader.getText());
                } else if (event == XMLStreamReader.END_ELEMENT) {
                    System.out.println("End element: " + reader.getLocalName());
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
