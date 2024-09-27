import javax.imageio.stream.FileImageInputStream;
import java.io.IOException;

public class FileImageInputStream_5 {
    public static void main(String[] args) {
        FileImageInputStream stream = null;
        
        try {
            stream = new FileImageInputStream(new File("example.jpg"));
            // Perform operations with the stream
            
            // Closing the stream
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
