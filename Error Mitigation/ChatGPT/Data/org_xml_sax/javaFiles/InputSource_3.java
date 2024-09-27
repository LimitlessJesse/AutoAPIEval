import org.xml.sax.InputSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputSource_3 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        
        // Creating a byte stream
        String xmlString = "<root><element>Example</element></root>";
        InputStream byteStream = new ByteArrayInputStream(xmlString.getBytes());
        
        // Setting the byte stream for the input source
        inputSource.setByteStream(byteStream);
        
        // Accessing the byte stream
        InputStream retrievedByteStream = inputSource.getByteStream();
        System.out.println("Byte Stream: " + retrievedByteStream);
    }
}
