import javax.xml.transform.stax.StAXSource;
import javax.xml.stream.XMLStreamReader;

public class StAXSource_1 {
    public static void main(String[] args) {
        StAXSource staxSource = new StAXSource();
        XMLStreamReader xmlStreamReader = staxSource.getXMLStreamReader();
        System.out.println("XMLStreamReader: " + xmlStreamReader);
    }
}
