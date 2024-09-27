import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.io.Writer;

public class StreamResult_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write("Hello, World!");
        
        StreamResult result = new StreamResult(writer);
        Writer w = result.getWriter();
        
        w.write(" This is a test.");
        
        System.out.println(writer.toString());
    }
}
