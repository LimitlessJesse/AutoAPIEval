import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class StreamResult_3 {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult();
        streamResult.setWriter(stringWriter);
        
        // Perform transformation and write result to the writer set
    }
}
