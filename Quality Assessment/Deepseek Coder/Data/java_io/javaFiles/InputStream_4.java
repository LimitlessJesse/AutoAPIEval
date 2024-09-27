import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputStream_4 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

        try {
            System.out.println("Initial position: " + inputStream.getPos());
            inputStream.skip(3); // Skip the first 3 bytes
            System.out.println("Position after skipping 3 bytes: " + inputStream.getPos());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
