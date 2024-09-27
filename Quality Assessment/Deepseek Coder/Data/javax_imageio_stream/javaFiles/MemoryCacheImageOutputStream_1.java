import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            MemoryCacheImageOutputStream outputStream = new MemoryCacheImageOutputStream();
            outputStream.write(65); // ASCII value of 'A'
            outputStream.write(66); // ASCII value of 'B'
            outputStream.write(67); // ASCII value of 'C'

            byte[] data = outputStream.toByteArray();
            for (byte b : data) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
