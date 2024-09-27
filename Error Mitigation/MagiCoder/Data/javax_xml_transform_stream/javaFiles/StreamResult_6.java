import javax.xml.transform.stream.StreamResult;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class StreamResult_6 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("output.txt");
            StreamResult streamResult = new StreamResult(outputStream);
            streamResult.setOutputStream(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
