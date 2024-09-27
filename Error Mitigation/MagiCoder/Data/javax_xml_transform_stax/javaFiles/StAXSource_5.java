import javax.xml.transform.stax.StAXSource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class StAXSource_5 {
    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader("<root>Hello</root>"));
        StAXSource source = new StAXSource(reader);
        String systemId = source.getSystemId();
        System.out.println(systemId);
    }
}
