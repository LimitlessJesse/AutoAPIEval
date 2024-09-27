import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class SAXSource_5 {
    public static void main(String[] args) {
        String xml = "<root>Hello World</root>";
        StringReader reader = new StringReader(xml);
        StreamSource source = new StreamSource(reader);
        SAXSource saxSource = new SAXSource();
        saxSource.setInputSource(source);
    }
}
