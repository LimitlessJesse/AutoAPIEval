import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStream_5 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] data = {65, 66, 67, 68, 69}; // ASCII values for A, B, C, D, E
            int offset = 1;
            int length = 3;
            
            outputStream.write(data, offset, length);
            
            byte[] result = outputStream.toByteArray();
            for (byte b : result) {
                System.out.print((char) b + " "); // Output: B C D 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
