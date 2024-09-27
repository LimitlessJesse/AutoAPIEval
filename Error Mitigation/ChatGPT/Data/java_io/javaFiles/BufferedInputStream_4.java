import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Set a mark position with read limit of 100 bytes
            bufferedInputStream.mark(100);

            // Read data from the input stream
            int data = bufferedInputStream.read();
            System.out.println("Read data: " + data);

            // Reset to the previously set mark position
            bufferedInputStream.reset();

            // Read data again from the input stream
            data = bufferedInputStream.read();
            System.out.println("Read data after reset: " + data);

            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
