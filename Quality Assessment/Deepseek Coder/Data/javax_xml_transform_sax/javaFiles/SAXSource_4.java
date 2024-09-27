import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class SAXSource_4 {
    public static void main(String[] args) {
        // Create a StringReader with some XML content
        StringReader reader = new StringReader("<root>Hello, World</root>");

        // Create a StreamSource from the StringReader
        StreamSource source = new StreamSource(reader);

        // Create a SAXSource from the StreamSource
        SAXSource saxSource = new SAXSource(source);

        // Get the InputSource from the SAXSource
        javax.xml.transform.sax.InputSource inputSource = saxSource.getInputSource();

        // Print the InputSource
        System.out.println(inputSource);
    }
}
