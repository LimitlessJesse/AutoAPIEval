import org.xml.sax.InputSource;
import java.io.StringReader;

public class InputSource_3 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        String xmlString = "<example>Hello World!</example>";
        StringReader reader = new StringReader(xmlString);
        
        inputSource.setCharacterStream(reader);
        
        System.out.println("Character stream set successfully");
    }
}
