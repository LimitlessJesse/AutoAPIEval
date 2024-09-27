import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;

public class StreamSource_4 {
    public static void main(String[] args) {
        try {
            // Create a StreamSource object
            StreamSource source = new StreamSource("path/to/your/file.xml");
            
            // Get the InputStream from the StreamSource
            InputStream inputStream = source.getInputStream();
            
            // Read from the InputStream
            int data = inputStream.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            
            // Close the InputStream
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
