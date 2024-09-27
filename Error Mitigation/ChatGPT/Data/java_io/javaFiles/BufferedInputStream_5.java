import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Mark the current position
            bis.mark(0);

            // Read some bytes
            bis.read();
            bis.read();

            // Reset to the marked position
            bis.reset();

            // Read from the marked position again
            bis.read();

            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
