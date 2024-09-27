import org.xml.sax.InputSource;
import java.io.StringReader;

public class InputSource_7 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setCharacterStream(new StringReader("<xml>Hello, World!</xml>"));
    }
}
