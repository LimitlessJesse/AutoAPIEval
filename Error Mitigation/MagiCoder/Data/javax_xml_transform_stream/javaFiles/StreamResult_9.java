import javax.xml.transform.stream.StreamResult;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamResult_9 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult();
        try {
            OutputStream outputStream = new FileOutputStream("output.txt");
            streamResult.setOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
