import org.xml.sax.InputSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputSource_2 {
    
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        String xmlString = "<root><element>Test</element></root>";
        InputStream byteStream = new ByteArrayInputStream(xmlString.getBytes());
        
        inputSource.setByteStream(byteStream);
        
        // Use the InputSource with the set byte stream
    }
}
