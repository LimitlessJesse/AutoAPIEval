import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            MemoryCacheImageOutputStream output = new MemoryCacheImageOutputStream(new ByteArrayOutputStream());
            output.write(65); // Writing ASCII value of 'A' to the output stream
            System.out.println("Byte 'A' has been written to the stream.");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
