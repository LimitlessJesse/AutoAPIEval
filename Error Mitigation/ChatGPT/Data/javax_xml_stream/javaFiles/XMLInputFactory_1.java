import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLInputFactory_1 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new StringReader("<example>Hello World</example>"));
            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamReader.START_ELEMENT) {
                    System.out.println("Start Element: " + reader.getLocalName());
                } else if (event == XMLStreamReader.CHARACTERS) {
                    System.out.println("Text: " + reader.getText());
                } else if (event == XMLStreamReader.END_ELEMENT) {
                    System.out.println("End Element: " + reader.getLocalName());
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
