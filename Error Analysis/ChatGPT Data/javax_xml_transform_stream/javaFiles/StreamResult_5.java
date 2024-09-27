import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class StreamResult_5 {
    public static void main(String[] args) {
        StreamResult result = new StreamResult();
        File file = new File("output.xml");
        
        result.setSystemId(file);
        
        System.out.println("System ID set to: " + result.getSystemId());
    }
}
