import javax.xml.transform.stream.StreamResult;
import java.io.Writer;

public class StreamResult_8 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult();
        Writer writer = streamResult.getWriter();
    }
}
