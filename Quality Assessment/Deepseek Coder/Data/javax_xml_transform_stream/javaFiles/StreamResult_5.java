import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamResult_5 {
    public static void main(String[] args) {
        try {
            // Create a new StreamResult object
            StreamResult result = new StreamResult();

            // Set an output stream to the StreamResult object
            result.setOutputStream(new FileOutputStream("output.txt"));

            // Write to the output stream
            result.getOutputStream().write("Hello, World!".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
