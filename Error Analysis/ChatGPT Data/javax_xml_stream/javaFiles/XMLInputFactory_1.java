import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLInputFactory_1 {
    public static void main(String[] args) throws XMLStreamException {
        String xmlString = "<book><title>Java Programming</title><author>John Doe</author></book>";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xmlString));

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

        reader.close();
    }
}
