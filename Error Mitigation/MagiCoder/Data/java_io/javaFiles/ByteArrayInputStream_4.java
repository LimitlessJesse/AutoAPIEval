import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream_4 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

        try {
            // Skip 5 bytes
            long skippedBytes = inputStream.skip(5);
            System.out.println("Skipped " + skippedBytes + " bytes");

            // Read the next byte
            int nextByte = inputStream.read();
            System.out.println("Next byte: " + nextByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
