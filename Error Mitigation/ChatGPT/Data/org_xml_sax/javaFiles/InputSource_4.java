import org.xml.sax.InputSource;

import java.io.StringReader;

public class InputSource_4 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        String xmlString = "<root><element>Value</element></root>";
        Reader reader = new StringReader(xmlString);
        
        inputSource.setCharacterStream(reader);
    }
}
