import org.xml.sax.InputSource;
import java.io.StringReader;

public class InputSource_13 {
    public static void main(String[] args) {
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root>Hello, World</root>";
        InputSource inputSource = new InputSource(new StringReader(xmlString));
        String encoding = inputSource.getEncoding();
        System.out.println("Encoding: " + encoding);
    }
}
