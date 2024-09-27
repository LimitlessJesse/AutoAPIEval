import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class StreamSource_8 {
    public static void main(String[] args) {
        StreamSource source = new StreamSource();
        String xml = "<root>Hello World</root>";
        source.setReader(new StringReader(xml));
        
        // Now you can use the source object to read the XML data
    }
}
