import javax.xml.transform.stream.StreamSource;
import java.io.Reader;
import java.io.StringReader;

public class StreamSource_5 {
    public static void main(String[] args) {
        String xmlString = "<root>Hello World</root>";
        StreamSource source = new StreamSource(new StringReader(xmlString));
        Reader reader = source.getReader();
        System.out.println(reader);
    }
}
