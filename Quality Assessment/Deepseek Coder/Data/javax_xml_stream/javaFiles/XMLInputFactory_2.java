import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLInputFactory_2 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        StringReader reader = new StringReader("<example>Hello World</example>");

        try {
            XMLStreamReader xmlReader = factory.createXMLStreamReader(reader);

            while (xmlReader.hasNext()) {
                int event = xmlReader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        System.out.println("Start Element: " + xmlReader.getLocalName());
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        System.out.println("Characters: " + xmlReader.getText());
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        System.out.println("End Element: " + xmlReader.getLocalName());
                        break;
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
