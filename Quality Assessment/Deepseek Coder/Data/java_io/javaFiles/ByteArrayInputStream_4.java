import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream_4 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);

        try {
            bis.skip(2); // Skip the first 2 bytes
            int data = bis.read(); // Read the next byte
            while (data!= -1) {
                System.out.println((char) data);
                data = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
