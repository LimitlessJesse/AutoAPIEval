import org.xml.sax.InputSource;
import java.io.StringReader;

public class InputSource_6 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        String xmlString = "<root>Hello, World</root>";
        inputSource.setCharacterStream(new StringReader(xmlString));
        
        // You can now use the inputSource object for further processing
    }
}
