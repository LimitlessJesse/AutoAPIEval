import java.util.zip.InflaterInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InflaterInputStream_5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("compressedFile.gz");
             InflaterInputStream iis = new InflaterInputStream(fis)) {
             
            // Read data from the input stream
            
            iis.close(); // Close the input stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
