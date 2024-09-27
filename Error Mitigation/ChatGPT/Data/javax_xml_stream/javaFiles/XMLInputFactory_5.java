import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLInputFactory_5 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader("systemId", new StringReader("<xml>data</xml>"));
            while (reader.hasNext()) {
                reader.next();
                System.out.println(reader.getText());
            }
            reader.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
