import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class StreamSource_2 {
    public static void main(String[] args) {
        StreamSource source = new StreamSource();
        String xmlString = "<root><element>value</element></root>";
        StringReader reader = new StringReader(xmlString);
        source.setReader(reader);
    }
}
