import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            MemoryCacheImageOutputStream imageOutputStream = new MemoryCacheImageOutputStream(outputStream);
            
            byte[] data = {65, 66, 67}; // Sample byte array
            
            imageOutputStream.write(data, 0, data.length);
            
            byte[] result = outputStream.toByteArray();
            for (byte b : result) {
                System.out.print((char) b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
