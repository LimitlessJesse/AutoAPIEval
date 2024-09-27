import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_2 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            MemoryCacheImageOutputStream imageOutputStream = new MemoryCacheImageOutputStream(outputStream);
            
            // Writing a single byte to the stream
            int b = 65; // ASCII value of 'A'
            imageOutputStream.write(b);
            
            // Displaying the output stream
            byte[] outputBytes = outputStream.toByteArray();
            for (byte outputByte : outputBytes) {
                System.out.print((char) outputByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
