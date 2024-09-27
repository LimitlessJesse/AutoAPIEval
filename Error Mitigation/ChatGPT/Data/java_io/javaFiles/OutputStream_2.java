import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStream_2 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] data = {65, 66, 67}; // ASCII values for A, B, C
            outputStream.write(data);
            byte[] result = outputStream.toByteArray();
            for (byte b : result) {
                System.out.print((char) b); // Output: ABC
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
