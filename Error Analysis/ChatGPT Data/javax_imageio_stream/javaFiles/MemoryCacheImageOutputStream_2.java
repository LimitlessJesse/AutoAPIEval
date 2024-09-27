import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_2 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MemoryCacheImageOutputStream imageOutputStream = new MemoryCacheImageOutputStream(byteArrayOutputStream);
            
            byte[] data = {65, 66, 67, 68, 69}; // Sample byte array
            
            imageOutputStream.write(data, 1, 3); // Writing 3 bytes starting from index 1
            
            byte[] result = byteArrayOutputStream.toByteArray();
            
            for (byte b : result) {
                System.out.println(b);
            }
            
            imageOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
