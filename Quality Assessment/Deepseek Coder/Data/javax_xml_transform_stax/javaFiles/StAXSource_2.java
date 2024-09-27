import javax.xml.transform.stax.StAXSource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class StAXSource_2 {
    public static void main(String[] args) throws Exception {
        // Create an XML string
        String xml = "<root>Hello, World</root>";

        // Create an XMLInputFactory
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();

        // Create a StringReader from the XML string
        StringReader stringReader = new StringReader(xml);

        // Use the XMLInputFactory to create an XMLStreamReader from the StringReader
        XMLStreamReader streamReader = inputFactory.createXMLStreamReader(stringReader);

        // Use the StAXSource to create a StAXSource from the XMLStreamReader
        StAXSource staxSource = new StAXSource(streamReader);

        // Now you can use the StAXSource in your code
        //...
    }
}
