import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputStream_3 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        InputStream inputStream = new ByteArrayInputStream(data);

        try {
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer, 0, buffer.length))!= -1) {
                System.out.println("Bytes read: " + bytesRead);
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
