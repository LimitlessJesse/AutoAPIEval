import javax.xml.transform.stream.StreamResult;
import java.io.OutputStream;

public class StreamResult_2 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult();
        OutputStream outputStream = System.out;
        streamResult.setOutputStream(outputStream);
    }
}
