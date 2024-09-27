import javax.xml.transform.stream.StreamResult;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class StreamResult_2 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("output.xml");
            
            StreamResult streamResult = new StreamResult();
            streamResult.setOutputStream(outputStream);
            
            System.out.println("Output stream set successfully");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
