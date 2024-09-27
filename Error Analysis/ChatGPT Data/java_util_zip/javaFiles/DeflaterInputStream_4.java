import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_4 {
    public static void main(String[] args) {
        byte[] data = "Hello, World!".getBytes();
        DeflaterInputStream inputStream = new DeflaterInputStream(new ByteArrayOutputStream());
        
        try {
            // Process data using DeflaterInputStream
            
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
