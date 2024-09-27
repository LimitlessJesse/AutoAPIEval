import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.io.Writer;

public class StreamResult_5 {
    public static void main(String[] args) {
        StreamResult result = new StreamResult();
        Writer writer = new StringWriter();
        result.setWriter(writer);
    }
}
