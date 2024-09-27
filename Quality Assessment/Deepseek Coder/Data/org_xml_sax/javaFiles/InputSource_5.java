import org.xml.sax.InputSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputSource_5 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        String xmlString = "<root>Hello World</root>";
        InputStream byteStream = new ByteArrayInputStream(xmlString.getBytes());
        inputSource.setByteStream(byteStream);
    }
}
