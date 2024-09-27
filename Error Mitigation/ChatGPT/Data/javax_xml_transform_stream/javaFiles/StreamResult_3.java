import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.io.Writer;

public class StreamResult_3 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult();
        StringWriter stringWriter = new StringWriter();
        streamResult.setWriter(stringWriter);
    }
}
