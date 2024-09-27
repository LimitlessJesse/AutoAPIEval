import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stax.StAXSource;

public class StAXSource_4 {
    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader("<root>Hello</root>"));
        StAXSource source = new StAXSource(reader);

        // Now you can use source for transformation or other operations
    }
}
