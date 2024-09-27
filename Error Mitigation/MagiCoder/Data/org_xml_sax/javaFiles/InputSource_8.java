import org.xml.sax.InputSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputSource_8 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        String xml = "<root>Hello, World!</root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        inputSource.setByteStream(inputStream);
    }
}
