import javax.xml.transform.stream.StreamResult;
import java.io.OutputStream;
import java.io.IOException;

public class StreamResult_6 {
    public static void main(String[] args) {
        try {
            // Create a StreamResult object
            StreamResult streamResult = new StreamResult();
            
            // Get the OutputStream from the StreamResult
            OutputStream outputStream = streamResult.getOutputStream();
            
            // Write to the OutputStream
            outputStream.write("Hello, World!".getBytes());
            
            // Flush and close the OutputStream
            outputStream.flush();
            outputStream.close();
            
            // Get the string representation of the StreamResult
            String result = streamResult.toString();
            
            // Print the result
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
