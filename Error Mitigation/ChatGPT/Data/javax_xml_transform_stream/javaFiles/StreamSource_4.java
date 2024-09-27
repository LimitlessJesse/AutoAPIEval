import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StreamSource_4 {
    public static void main(String[] args) {
        byte[] bytes = "Hello, World!".getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        
        StreamSource streamSource = new StreamSource();
        streamSource.setInputStream(inputStream);
        
        InputStream result = streamSource.getInputStream();
        
        byte[] resultBytes = new byte[result.available()];
        result.read(resultBytes);
        
        System.out.println(new String(resultBytes));
    }
}
